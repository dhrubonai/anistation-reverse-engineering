package androidx.work.impl.model;

import defpackage.e73;
import defpackage.g85;
import defpackage.i77;
import defpackage.kv1;
import defpackage.l46;
import defpackage.ll5;
import defpackage.m46;
import defpackage.m85;
import defpackage.nt1;
import defpackage.pn6;
import defpackage.q23;
import defpackage.q71;
import defpackage.t80;
import defpackage.tg5;
import defpackage.v65;
import defpackage.wm;
import defpackage.zg;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class SystemIdInfoDao_Impl implements m46 {
    public static final Companion Companion = new Companion(null);
    private final v65 __db;
    private final kv1 __insertAdapterOfSystemIdInfo;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* renamed from: androidx.work.impl.model.SystemIdInfoDao_Impl$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kv1 {
        @Override // defpackage.kv1
        public void bind(m85 m85Var, l46 l46Var) {
            m85Var.getClass();
            l46Var.getClass();
            m85Var.J(1, l46Var.a);
            m85Var.e(2, l46Var.b);
            m85Var.e(3, l46Var.c);
        }

        @Override // defpackage.kv1
        public String createQuery() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }
    }

    public SystemIdInfoDao_Impl(v65 v65Var) {
        v65Var.getClass();
        this.__db = v65Var;
        this.__insertAdapterOfSystemIdInfo = new kv1() { // from class: androidx.work.impl.model.SystemIdInfoDao_Impl.1
            @Override // defpackage.kv1
            public void bind(m85 m85Var, l46 l46Var) {
                m85Var.getClass();
                l46Var.getClass();
                m85Var.J(1, l46Var.a);
                m85Var.e(2, l46Var.b);
                m85Var.e(3, l46Var.c);
            }

            @Override // defpackage.kv1
            public String createQuery() {
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            }
        };
    }

    public static final l46 getSystemIdInfo$lambda$0(String str, String str2, int i, g85 g85Var) {
        l46 l46Var;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            s0.e(2, i);
            int K = t80.K(s0, "work_spec_id");
            int K2 = t80.K(s0, "generation");
            int K3 = t80.K(s0, "system_id");
            if (s0.p0()) {
                l46Var = new l46(s0.c0(K), (int) s0.getLong(K2), (int) s0.getLong(K3));
            } else {
                l46Var = null;
            }
            return l46Var;
        } finally {
            s0.close();
        }
    }

    public static final List getWorkSpecIds$lambda$0(String str, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            ArrayList arrayList = new ArrayList();
            while (s0.p0()) {
                arrayList.add(s0.c0(0));
            }
            return arrayList;
        } finally {
            s0.close();
        }
    }

    public static final pn6 insertSystemIdInfo$lambda$0(SystemIdInfoDao_Impl systemIdInfoDao_Impl, l46 l46Var, g85 g85Var) {
        g85Var.getClass();
        systemIdInfoDao_Impl.__insertAdapterOfSystemIdInfo.insert(g85Var, l46Var);
        return pn6.a;
    }

    public static final pn6 removeSystemIdInfo$lambda$0(String str, String str2, int i, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            s0.e(2, i);
            s0.p0();
            s0.close();
            return pn6.a;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    public static final pn6 removeSystemIdInfo$lambda$1(String str, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            s0.p0();
            s0.close();
            return pn6.a;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    @Override // defpackage.m46
    public l46 getSystemIdInfo(String str, int i) {
        str.getClass();
        return (l46) q23.J(this.__db, true, false, new wm(str, i, (byte) 2));
    }

    @Override // defpackage.m46
    public List<String> getWorkSpecIds() {
        return (List) q23.J(this.__db, true, false, new tg5((byte) 21));
    }

    @Override // defpackage.m46
    public void insertSystemIdInfo(l46 l46Var) {
        l46Var.getClass();
        q23.J(this.__db, false, true, new ll5(this, l46Var, (byte) 4));
    }

    @Override // defpackage.m46
    public void removeSystemIdInfo(String str) {
        str.getClass();
        q23.J(this.__db, false, true, new zg(str, (byte) 25));
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final List<e73> getRequiredConverters() {
            return nt1.x;
        }

        private Companion() {
        }
    }

    @Override // defpackage.m46
    public void removeSystemIdInfo(String str, int i) {
        str.getClass();
        q23.J(this.__db, false, true, new wm(str, i, (byte) 1));
    }

    @Override // defpackage.m46
    public l46 getSystemIdInfo(i77 i77Var) {
        i77Var.getClass();
        return getSystemIdInfo(i77Var.a, i77Var.b);
    }

    public void removeSystemIdInfo(i77 i77Var) {
        i77Var.getClass();
        removeSystemIdInfo(i77Var.a, i77Var.b);
    }
}
