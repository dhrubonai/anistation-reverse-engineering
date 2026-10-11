package androidx.work.impl.model;

import defpackage.a34;
import defpackage.dr6;
import defpackage.e41;
import defpackage.e73;
import defpackage.g85;
import defpackage.kv1;
import defpackage.ll5;
import defpackage.m85;
import defpackage.nt1;
import defpackage.pn6;
import defpackage.q23;
import defpackage.q71;
import defpackage.r77;
import defpackage.s77;
import defpackage.t77;
import defpackage.v65;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class WorkProgressDao_Impl implements t77 {
    public static final Companion Companion = new Companion(null);
    private final v65 __db;
    private final kv1 __insertAdapterOfWorkProgress;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* renamed from: androidx.work.impl.model.WorkProgressDao_Impl$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kv1 {
        @Override // defpackage.kv1
        public void bind(m85 m85Var, s77 s77Var) {
            m85Var.getClass();
            s77Var.getClass();
            m85Var.J(1, s77Var.a);
            e41 e41Var = e41.b;
            m85Var.f(2, a34.t0(s77Var.b));
        }

        @Override // defpackage.kv1
        public String createQuery() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }
    }

    public WorkProgressDao_Impl(v65 v65Var) {
        v65Var.getClass();
        this.__db = v65Var;
        this.__insertAdapterOfWorkProgress = new kv1() { // from class: androidx.work.impl.model.WorkProgressDao_Impl.1
            @Override // defpackage.kv1
            public void bind(m85 m85Var, s77 s77Var) {
                m85Var.getClass();
                s77Var.getClass();
                m85Var.J(1, s77Var.a);
                e41 e41Var = e41.b;
                m85Var.f(2, a34.t0(s77Var.b));
            }

            @Override // defpackage.kv1
            public String createQuery() {
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            }
        };
    }

    public static final pn6 delete$lambda$0(String str, String str2, g85 g85Var) {
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

    public static final pn6 deleteAll$lambda$0(String str, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.p0();
            s0.close();
            return pn6.a;
        } catch (Throwable th) {
            s0.close();
            throw th;
        }
    }

    public static final e41 getProgressForWorkSpecId$lambda$0(String str, String str2, g85 g85Var) {
        byte[] blob;
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            e41 e41Var = null;
            if (s0.p0()) {
                if (s0.isNull(0)) {
                    blob = null;
                } else {
                    blob = s0.getBlob(0);
                }
                if (blob != null) {
                    e41 e41Var2 = e41.b;
                    e41Var = a34.U(blob);
                }
            }
            return e41Var;
        } finally {
            s0.close();
        }
    }

    public static final pn6 insert$lambda$0(WorkProgressDao_Impl workProgressDao_Impl, s77 s77Var, g85 g85Var) {
        g85Var.getClass();
        workProgressDao_Impl.__insertAdapterOfWorkProgress.insert(g85Var, s77Var);
        return pn6.a;
    }

    @Override // defpackage.t77
    public void delete(String str) {
        str.getClass();
        q23.J(this.__db, false, true, new r77(str, (byte) 3));
    }

    @Override // defpackage.t77
    public void deleteAll() {
        q23.J(this.__db, false, true, new dr6((byte) 26));
    }

    public e41 getProgressForWorkSpecId(String str) {
        str.getClass();
        return (e41) q23.J(this.__db, true, false, new r77(str, (byte) 2));
    }

    @Override // defpackage.t77
    public void insert(s77 s77Var) {
        s77Var.getClass();
        q23.J(this.__db, false, true, new ll5(this, s77Var, (byte) 27));
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
}
