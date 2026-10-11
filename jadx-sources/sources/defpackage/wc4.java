package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wc4 {
    public static final p18 g = new p18((byte) 26);
    public static volatile wc4 h;
    public final Context a;
    public final ml1 b;
    public final jd4 c;
    public final lp5 d;
    public final x71 e;
    public final ik1 f;

    /* JADX WARN: Type inference failed for: r0v0, types: [cx5, android.database.sqlite.SQLiteOpenHelper] */
    /* JADX WARN: Type inference failed for: r8v1, types: [x94, java.lang.Object] */
    public wc4(ok1 ok1Var, Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        vz0 vz0Var = null;
        ?? sQLiteOpenHelper = new SQLiteOpenHelper(applicationContext.getApplicationContext(), "exoplayer_internal.db", (SQLiteDatabase.CursorFactory) null, 1);
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(6);
        this.b = ml1.d.j(ok1Var, applicationContext);
        ke0 b = db.b(tl7.L(iv5.a(), rh1.a));
        id4 id4Var = new id4();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        id4Var.v = dq6.b(15L, timeUnit);
        id4Var.w = dq6.b(45L, timeUnit);
        nh1 nh1Var = new nh1();
        synchronized (nh1Var) {
            nh1Var.a = (byte) 15;
        }
        nh1Var.c();
        synchronized (nh1Var) {
            nh1Var.b = (byte) 15;
        }
        nh1Var.c();
        id4Var.a = nh1Var;
        id4Var.c.add(new rv0((byte) 4));
        jd4 jd4Var = new jd4(id4Var);
        this.c = jd4Var;
        lp5 lp5Var = new lp5(new File(applicationContext.getFilesDir(), "offline_media"), new Object(), sQLiteOpenHelper);
        this.d = lp5Var;
        x71 x71Var = new x71(sQLiteOpenHelper);
        this.e = x71Var;
        newFixedThreadPool.getClass();
        byte b2 = 19;
        ik1 ik1Var = new ik1(applicationContext, x71Var, new dn0(lp5Var, jd4Var, newFixedThreadPool, b2));
        if (ik1Var.i != 3) {
            ik1Var.i = (byte) 3;
            ik1Var.e++;
            ik1Var.b.obtainMessage(5, 3, 0).sendToTarget();
        }
        if (ik1Var.j != 5) {
            ik1Var.j = (byte) 5;
            ik1Var.e++;
            ik1Var.b.obtainMessage(6, 5, 0).sendToTarget();
        }
        ik1Var.d(new u35(2));
        this.f = ik1Var;
        tl7.z(b, null, null, new hu1(this, vz0Var, b2), 3);
    }
}
