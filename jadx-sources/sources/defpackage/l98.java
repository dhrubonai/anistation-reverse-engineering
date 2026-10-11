package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l98 implements k98, ea8 {
    public static final String i = new String();
    public final Level a;
    public final long b;
    public r98 c;
    public z98 d;
    public pa8 e;
    public uc7 f;
    public Object[] g;
    public final /* synthetic */ i75 h;

    public l98(i75 i75Var, Level level) {
        this.h = i75Var;
        qc7.a.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        it5.h(level, "level");
        this.a = level;
        this.b = nanos;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z98, y98, java.lang.Object] */
    @Override // defpackage.ea8
    public final ea8 a() {
        ?? obj = new Object();
        obj.b = 0;
        if (this.d == null) {
            this.d = obj;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0223  */
    @Override // defpackage.ea8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r19, java.lang.Object[] r20) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l98.b(java.lang.String, java.lang.Object[]):void");
    }

    @Override // defpackage.ea8
    public final ea8 c(Throwable th) {
        ia8 ia8Var = p98.a;
        it5.h(ia8Var, "metadata key");
        if (th != null) {
            e(ia8Var, th);
        }
        return this;
    }

    public final rv5 d() {
        r98 r98Var = this.c;
        if (r98Var != null) {
            return r98Var;
        }
        return eb8.a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [r98, java.lang.Object] */
    public final void e(ia8 ia8Var, Object obj) {
        r98 r98Var = this.c;
        r98 r98Var2 = r98Var;
        if (r98Var == null) {
            ?? obj2 = new Object();
            obj2.a = new Object[8];
            obj2.b = 0;
            this.c = obj2;
            r98Var2 = obj2;
        }
        r98Var2.m(ia8Var, obj);
    }
}
