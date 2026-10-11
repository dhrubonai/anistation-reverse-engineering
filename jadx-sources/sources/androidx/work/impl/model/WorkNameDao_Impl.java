package androidx.work.impl.model;

import defpackage.e73;
import defpackage.g85;
import defpackage.kv1;
import defpackage.ll5;
import defpackage.m85;
import defpackage.nt1;
import defpackage.p77;
import defpackage.pn6;
import defpackage.q23;
import defpackage.q71;
import defpackage.q77;
import defpackage.r77;
import defpackage.v65;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class WorkNameDao_Impl implements q77 {
    public static final Companion Companion = new Companion(null);
    private final v65 __db;
    private final kv1 __insertAdapterOfWorkName;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* renamed from: androidx.work.impl.model.WorkNameDao_Impl$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kv1 {
        @Override // defpackage.kv1
        public void bind(m85 m85Var, p77 p77Var) {
            m85Var.getClass();
            p77Var.getClass();
            m85Var.J(1, p77Var.a);
            m85Var.J(2, p77Var.b);
        }

        @Override // defpackage.kv1
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public WorkNameDao_Impl(v65 v65Var) {
        v65Var.getClass();
        this.__db = v65Var;
        this.__insertAdapterOfWorkName = new kv1() { // from class: androidx.work.impl.model.WorkNameDao_Impl.1
            @Override // defpackage.kv1
            public void bind(m85 m85Var, p77 p77Var) {
                m85Var.getClass();
                p77Var.getClass();
                m85Var.J(1, p77Var.a);
                m85Var.J(2, p77Var.b);
            }

            @Override // defpackage.kv1
            public String createQuery() {
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            }
        };
    }

    public static final List getNamesForWorkSpecId$lambda$0(String str, String str2, g85 g85Var) {
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

    public static final List getWorkSpecIdsWithName$lambda$0(String str, String str2, g85 g85Var) {
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

    public static final pn6 insert$lambda$0(WorkNameDao_Impl workNameDao_Impl, p77 p77Var, g85 g85Var) {
        g85Var.getClass();
        workNameDao_Impl.__insertAdapterOfWorkName.insert(g85Var, p77Var);
        return pn6.a;
    }

    @Override // defpackage.q77
    public List<String> getNamesForWorkSpecId(String str) {
        str.getClass();
        return (List) q23.J(this.__db, true, false, new r77(str, (byte) 1));
    }

    public List<String> getWorkSpecIdsWithName(String str) {
        str.getClass();
        return (List) q23.J(this.__db, true, false, new r77(str, (byte) 0));
    }

    @Override // defpackage.q77
    public void insert(p77 p77Var) {
        p77Var.getClass();
        q23.J(this.__db, false, true, new ll5(this, p77Var, (byte) 26));
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
