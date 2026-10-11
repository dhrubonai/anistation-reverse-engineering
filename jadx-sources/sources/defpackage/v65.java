package defpackage;

import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class v65 {
    public static final r65 Companion = new Object();
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private ix autoCloser;
    private r51 configuration;
    private o65 connectionManager;
    private v11 coroutineScope;
    private Executor internalQueryExecutor;
    private i33 internalTracker;
    private Executor internalTransactionExecutor;
    protected List<? extends pm0> mCallbacks;
    protected volatile x26 mDatabase;
    private l11 transactionContext;
    private final wn0 closeBarrier = new wn0(new ia(0, this, v65.class, "onClosed", "onClosed()V", 0, 18));
    private final ThreadLocal<l11> suspendingTransactionContext = new ThreadLocal<>();
    private final Map<e73, Object> typeConverters = new LinkedHashMap();
    private boolean useTempTrackingTable = true;

    public static final void access$onClosed(v65 v65Var) {
        v11 v11Var = v65Var.coroutineScope;
        if (v11Var != null) {
            db.t(v11Var, null);
            l24 l24Var = v65Var.getInvalidationTracker().k;
            if (l24Var != null && l24Var.e.compareAndSet(false, true)) {
                l24Var.b.d(l24Var.i);
                try {
                    pt2 pt2Var = l24Var.g;
                    if (pt2Var != null) {
                        pt2Var.D(l24Var.j, l24Var.f);
                    }
                } catch (RemoteException e) {
                    Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e);
                }
                l24Var.c.unbindService(l24Var.k);
            }
            o65 o65Var = v65Var.connectionManager;
            if (o65Var != null) {
                o65Var.f.close();
                a36 a36Var = o65Var.g;
                if (a36Var != null) {
                    a36Var.close();
                    return;
                }
                return;
            }
            a34.s0("connectionManager");
            throw null;
        }
        a34.s0("coroutineScope");
        throw null;
    }

    public static /* synthetic */ Cursor query$default(v65 v65Var, c36 c36Var, CancellationSignal cancellationSignal, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                cancellationSignal = null;
            }
            return v65Var.query(c36Var, cancellationSignal);
        }
        ov3.g("Super calls with default arguments not supported in this target, function: query");
        return null;
    }

    public final Object a(sb2 sb2Var) {
        if (inCompatibilityMode()) {
            beginTransaction();
            try {
                Object invoke = sb2Var.invoke();
                setTransactionSuccessful();
                return invoke;
            } finally {
                endTransaction();
            }
        }
        return q23.J(this, false, true, new mm(sb2Var, (byte) 9));
    }

    public final void addTypeConverter$room_runtime(e73 e73Var, Object obj) {
        e73Var.getClass();
        obj.getClass();
        this.typeConverters.put(e73Var, obj);
    }

    public void assertNotMainThread() {
        if (this.allowMainThreadQueries || !isMainThread$room_runtime()) {
            return;
        }
        ze0.m("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
    }

    public void assertNotSuspendingTransaction() {
        rh6 rh6Var;
        if (inCompatibilityMode() && !inTransaction()) {
            l11 l11Var = this.suspendingTransactionContext.get();
            if (l11Var != null) {
                rh6Var = (rh6) l11Var.get(rh6.y);
            } else {
                rh6Var = null;
            }
            if (rh6Var != null) {
                ze0.m("Cannot access database on a different coroutine context inherited from a suspending transaction.");
            }
        }
    }

    @de1
    public void beginTransaction() {
        assertNotMainThread();
        assertNotMainThread();
        x26 X = getOpenHelper().X();
        if (!X.j()) {
            i33 invalidationTracker = getInvalidationTracker();
            invalidationTracker.getClass();
            iv.L(new h33(invalidationTracker, null, (byte) 2));
        }
        if (X.h0()) {
            X.R();
        } else {
            X.n();
        }
    }

    public void close() {
        wn0 wn0Var = this.closeBarrier;
        synchronized (wn0Var) {
            if (!wn0Var.c.compareAndSet(false, true)) {
                return;
            }
            do {
            } while (wn0Var.b.get() != 0);
            wn0Var.a.invoke();
            wn0Var.d.compareAndSet(false, true);
        }
    }

    public h36 compileStatement(String str) {
        str.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().X().x(str);
    }

    public List createAutoMigrations(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(vn3.S(map.size()));
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            linkedHashMap.put(t80.M((e73) entry.getKey()), entry.getValue());
        }
        return getAutoMigrations(linkedHashMap);
    }

    public final o65 createConnectionManager$room_runtime(r51 r51Var) {
        z65 z65Var;
        r51Var.getClass();
        try {
            a75 createOpenDelegate = createOpenDelegate();
            createOpenDelegate.getClass();
            z65Var = (z65) createOpenDelegate;
        } catch (xa4 unused) {
            z65Var = null;
        }
        if (z65Var == null) {
            return new o65(r51Var, new pz3((Object) this, (byte) 16), new hj1(2, this, w65.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, (byte) 5));
        }
        return new o65(r51Var, z65Var, new hj1(2, this, w65.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, (byte) 6));
    }

    public abstract i33 createInvalidationTracker();

    public a75 createOpenDelegate() {
        throw new xa4(0);
    }

    @de1
    public a36 createOpenHelper(r51 r51Var) {
        r51Var.getClass();
        throw new xa4(0);
    }

    @de1
    public void endTransaction() {
        getOpenHelper().X().a0();
        if (!inTransaction()) {
            i33 invalidationTracker = getInvalidationTracker();
            invalidationTracker.c.e(invalidationTracker.g, invalidationTracker.h);
        }
    }

    @de1
    public List<oy3> getAutoMigrations(Map<Class<? extends jx>, jx> map) {
        map.getClass();
        return nt1.x;
    }

    public final wn0 getCloseBarrier$room_runtime() {
        return this.closeBarrier;
    }

    public final v11 getCoroutineScope() {
        v11 v11Var = this.coroutineScope;
        if (v11Var != null) {
            return v11Var;
        }
        a34.s0("coroutineScope");
        throw null;
    }

    public final h85 getDriver() {
        r51 r51Var = this.configuration;
        if (r51Var != null) {
            h85 h85Var = r51Var.t;
            if (h85Var != null) {
                return h85Var;
            }
            ze0.m("No SQLiteDriver was configured with Room.");
            return null;
        }
        a34.s0("configuration");
        throw null;
    }

    public i33 getInvalidationTracker() {
        i33 i33Var = this.internalTracker;
        if (i33Var != null) {
            return i33Var;
        }
        a34.s0("internalTracker");
        throw null;
    }

    public a36 getOpenHelper() {
        o65 o65Var = this.connectionManager;
        if (o65Var != null) {
            a36 a36Var = o65Var.g;
            if (a36Var != null) {
                return a36Var;
            }
            ze0.m("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
            return null;
        }
        a34.s0("connectionManager");
        throw null;
    }

    public final String getPath() {
        r51 r51Var = this.configuration;
        if (r51Var != null) {
            String str = r51Var.b;
            if (str == null) {
                return null;
            }
            if (r51Var != null) {
                return r51Var.a.getDatabasePath(str).getPath();
            }
            a34.s0("configuration");
            throw null;
        }
        a34.s0("configuration");
        throw null;
    }

    public final l11 getQueryContext() {
        v11 v11Var = this.coroutineScope;
        if (v11Var != null) {
            return v11Var.getCoroutineContext();
        }
        a34.s0("coroutineScope");
        throw null;
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        a34.s0("internalQueryExecutor");
        throw null;
    }

    public Set getRequiredAutoMigrationSpecClasses() {
        Set<Class<? extends jx>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        ArrayList arrayList = new ArrayList(zo0.V(requiredAutoMigrationSpecs, 10));
        Iterator<T> it = requiredAutoMigrationSpecs.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            cls.getClass();
            arrayList.add(z05.a(cls));
        }
        return yo0.N0(arrayList);
    }

    @de1
    public Set<Class<? extends jx>> getRequiredAutoMigrationSpecs() {
        return tt1.x;
    }

    public Map getRequiredTypeConverterClasses() {
        Set<Map.Entry<Class<?>, List<Class<?>>>> entrySet = getRequiredTypeConverters().entrySet();
        int S = vn3.S(zo0.V(entrySet, 10));
        if (S < 16) {
            S = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(S);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Class cls = (Class) entry.getKey();
            List<Class> list = (List) entry.getValue();
            cls.getClass();
            im0 a = z05.a(cls);
            ArrayList arrayList = new ArrayList(zo0.V(list, 10));
            for (Class cls2 : list) {
                cls2.getClass();
                arrayList.add(z05.a(cls2));
            }
            linkedHashMap.put(a, arrayList);
        }
        return linkedHashMap;
    }

    public final Map<e73, List<e73>> getRequiredTypeConverterClassesMap$room_runtime() {
        return getRequiredTypeConverterClasses();
    }

    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return ot1.x;
    }

    public final ThreadLocal<l11> getSuspendingTransactionContext() {
        return this.suspendingTransactionContext;
    }

    public final l11 getTransactionContext$room_runtime() {
        l11 l11Var = this.transactionContext;
        if (l11Var != null) {
            return l11Var;
        }
        a34.s0("transactionContext");
        throw null;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        a34.s0("internalTransactionExecutor");
        throw null;
    }

    @de1
    public <T> T getTypeConverter(Class<T> cls) {
        cls.getClass();
        return (T) this.typeConverters.get(z05.a(cls));
    }

    public final boolean getUseTempTrackingTable$room_runtime() {
        return this.useTempTrackingTable;
    }

    public final boolean inCompatibilityMode() {
        o65 o65Var = this.connectionManager;
        if (o65Var != null) {
            if (o65Var.g != null) {
                return true;
            }
            return false;
        }
        a34.s0("connectionManager");
        throw null;
    }

    public boolean inTransaction() {
        if (isOpenInternal$room_runtime() && getOpenHelper().X().j()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
    
        defpackage.ze0.k("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071 A[LOOP:0: B:2:0x0035->B:13:0x0071, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0149 A[LOOP:5: B:56:0x011a->B:68:0x0149, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init(defpackage.r51 r19) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v65.init(r51):void");
    }

    public final void internalInitInvalidationTracker(g85 g85Var) {
        g85Var.getClass();
        i33 invalidationTracker = getInvalidationTracker();
        invalidationTracker.getClass();
        ak6 ak6Var = invalidationTracker.c;
        ak6Var.getClass();
        m85 s0 = g85Var.s0("PRAGMA query_only");
        try {
            s0.p0();
            boolean M = s0.M();
            o80.r(s0, null);
            if (!M) {
                zz.y("PRAGMA temp_store = MEMORY", g85Var);
                zz.y("PRAGMA recursive_triggers = 1", g85Var);
                zz.y("DROP TABLE IF EXISTS room_table_modification_log", g85Var);
                if (ak6Var.a) {
                    zz.y("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", g85Var);
                } else {
                    zz.y(b06.G("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""), g85Var);
                }
                kc4 kc4Var = (kc4) ak6Var.h;
                ReentrantLock reentrantLock = kc4Var.a;
                reentrantLock.lock();
                try {
                    kc4Var.d = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (invalidationTracker.l) {
                l24 l24Var = invalidationTracker.k;
                if (l24Var != null) {
                    Intent intent = invalidationTracker.j;
                    if (intent != null) {
                        if (l24Var.e.compareAndSet(true, false)) {
                            l24Var.c.bindService(intent, l24Var.k, 1);
                            i33 i33Var = l24Var.b;
                            j24 j24Var = l24Var.i;
                            j24Var.getClass();
                            i33Var.a(j24Var);
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
        } finally {
        }
    }

    public final boolean isMainThread$room_runtime() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public boolean isOpen() {
        o65 o65Var = this.connectionManager;
        if (o65Var != null) {
            x26 x26Var = o65Var.h;
            if (x26Var != null) {
                return x26Var.isOpen();
            }
            return false;
        }
        a34.s0("connectionManager");
        throw null;
    }

    public final boolean isOpenInternal$room_runtime() {
        o65 o65Var = this.connectionManager;
        if (o65Var != null) {
            x26 x26Var = o65Var.h;
            if (x26Var != null) {
                return x26Var.isOpen();
            }
            return false;
        }
        a34.s0("connectionManager");
        throw null;
    }

    public final void performClear(boolean z, String... strArr) {
        strArr.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        iv.L(new t84(this, z, strArr, (vz0) null));
    }

    public Cursor query(c36 c36Var, CancellationSignal cancellationSignal) {
        c36Var.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return getOpenHelper().X().Q(c36Var, cancellationSignal);
        }
        return getOpenHelper().X().o(c36Var);
    }

    public <V> V runInTransaction(Callable<V> callable) {
        callable.getClass();
        return (V) a(new nj4(callable, (byte) 8));
    }

    @de1
    public void setTransactionSuccessful() {
        getOpenHelper().X().P();
    }

    public final void setUseTempTrackingTable$room_runtime(boolean z) {
        this.useTempTrackingTable = z;
    }

    public final <R> Object useConnection(boolean z, ic2 ic2Var, vz0 vz0Var) {
        jf7.K(this);
        o65 o65Var = this.connectionManager;
        if (o65Var != null) {
            return o65Var.f.Y(z, ic2Var, vz0Var);
        }
        a34.s0("connectionManager");
        throw null;
    }

    public final <T> T getTypeConverter(e73 e73Var) {
        e73Var.getClass();
        T t = (T) this.typeConverters.get(e73Var);
        t.getClass();
        return t;
    }

    public void runInTransaction(Runnable runnable) {
        runnable.getClass();
        a(new nj4(runnable, (byte) 7));
    }

    @de1
    public static /* synthetic */ void getMCallbacks$annotations() {
    }

    @de1
    public static /* synthetic */ void getMDatabase$annotations() {
    }

    public Cursor query(String str, Object[] objArr) {
        str.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().X().o(new y23(str, objArr, (byte) 15));
    }

    public final Cursor query(c36 c36Var) {
        c36Var.getClass();
        return query$default(this, c36Var, null, 2, null);
    }

    @de1
    public void internalInitInvalidationTracker(x26 x26Var) {
        x26Var.getClass();
        internalInitInvalidationTracker(new w26(x26Var));
    }
}
