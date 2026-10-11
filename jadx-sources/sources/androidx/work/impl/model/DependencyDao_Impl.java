package androidx.work.impl.model;

import defpackage.ae1;
import defpackage.b0;
import defpackage.ce1;
import defpackage.e73;
import defpackage.g85;
import defpackage.kv1;
import defpackage.m85;
import defpackage.nt1;
import defpackage.pn6;
import defpackage.q23;
import defpackage.q71;
import defpackage.v65;
import defpackage.zg;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class DependencyDao_Impl implements ce1 {
    public static final Companion Companion = new Companion(null);
    private final v65 __db;
    private final kv1 __insertAdapterOfDependency;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* renamed from: androidx.work.impl.model.DependencyDao_Impl$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kv1 {
        @Override // defpackage.kv1
        public void bind(m85 m85Var, ae1 ae1Var) {
            m85Var.getClass();
            ae1Var.getClass();
            m85Var.J(1, ae1Var.a);
            m85Var.J(2, ae1Var.b);
        }

        @Override // defpackage.kv1
        public String createQuery() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }
    }

    public DependencyDao_Impl(v65 v65Var) {
        v65Var.getClass();
        this.__db = v65Var;
        this.__insertAdapterOfDependency = new kv1() { // from class: androidx.work.impl.model.DependencyDao_Impl.1
            @Override // defpackage.kv1
            public void bind(m85 m85Var, ae1 ae1Var) {
                m85Var.getClass();
                ae1Var.getClass();
                m85Var.J(1, ae1Var.a);
                m85Var.J(2, ae1Var.b);
            }

            @Override // defpackage.kv1
            public String createQuery() {
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }
        };
    }

    public static /* synthetic */ pn6 c(DependencyDao_Impl dependencyDao_Impl, ae1 ae1Var, g85 g85Var) {
        return insertDependency$lambda$0(dependencyDao_Impl, ae1Var, g85Var);
    }

    public static final List getDependentWorkIds$lambda$0(String str, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            ArrayList arrayList = new ArrayList();
            while (s0.p0()) {
                arrayList.add(s0.c0(0));
            }
            return arrayList;
        } finally {
            s0.close();
        }
    }

    public static final List getPrerequisites$lambda$0(String str, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            ArrayList arrayList = new ArrayList();
            while (s0.p0()) {
                arrayList.add(s0.c0(0));
            }
            return arrayList;
        } finally {
            s0.close();
        }
    }

    public static final boolean hasCompletedAllPrerequisites$lambda$0(String str, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        boolean z = true;
        try {
            s0.J(1, str2);
            boolean z2 = false;
            if (s0.p0()) {
                if (((int) s0.getLong(0)) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            s0.close();
        }
    }

    public static final boolean hasDependents$lambda$0(String str, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        boolean z = true;
        try {
            s0.J(1, str2);
            boolean z2 = false;
            if (s0.p0()) {
                if (((int) s0.getLong(0)) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            s0.close();
        }
    }

    public static final pn6 insertDependency$lambda$0(DependencyDao_Impl dependencyDao_Impl, ae1 ae1Var, g85 g85Var) {
        g85Var.getClass();
        dependencyDao_Impl.__insertAdapterOfDependency.insert(g85Var, ae1Var);
        return pn6.a;
    }

    @Override // defpackage.ce1
    public List<String> getDependentWorkIds(String str) {
        str.getClass();
        return (List) q23.J(this.__db, true, false, new zg(str, (byte) 4));
    }

    public List<String> getPrerequisites(String str) {
        str.getClass();
        return (List) q23.J(this.__db, true, false, new zg(str, (byte) 7));
    }

    @Override // defpackage.ce1
    public boolean hasCompletedAllPrerequisites(String str) {
        str.getClass();
        return ((Boolean) q23.J(this.__db, true, false, new zg(str, (byte) 6))).booleanValue();
    }

    @Override // defpackage.ce1
    public boolean hasDependents(String str) {
        str.getClass();
        return ((Boolean) q23.J(this.__db, true, false, new zg(str, (byte) 5))).booleanValue();
    }

    @Override // defpackage.ce1
    public void insertDependency(ae1 ae1Var) {
        ae1Var.getClass();
        q23.J(this.__db, false, true, new b0(this, ae1Var, (byte) 25));
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
