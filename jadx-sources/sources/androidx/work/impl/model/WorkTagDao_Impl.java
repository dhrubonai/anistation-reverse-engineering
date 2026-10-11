package androidx.work.impl.model;

import defpackage.e73;
import defpackage.g85;
import defpackage.g87;
import defpackage.h87;
import defpackage.i87;
import defpackage.kv1;
import defpackage.m85;
import defpackage.nt1;
import defpackage.pn6;
import defpackage.q23;
import defpackage.q71;
import defpackage.r77;
import defpackage.v65;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class WorkTagDao_Impl implements h87 {
    public static final Companion Companion = new Companion(null);
    private final v65 __db;
    private final kv1 __insertAdapterOfWorkTag;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* renamed from: androidx.work.impl.model.WorkTagDao_Impl$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kv1 {
        @Override // defpackage.kv1
        public void bind(m85 m85Var, g87 g87Var) {
            m85Var.getClass();
            g87Var.getClass();
            m85Var.J(1, g87Var.a);
            m85Var.J(2, g87Var.b);
        }

        @Override // defpackage.kv1
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public WorkTagDao_Impl(v65 v65Var) {
        v65Var.getClass();
        this.__db = v65Var;
        this.__insertAdapterOfWorkTag = new kv1() { // from class: androidx.work.impl.model.WorkTagDao_Impl.1
            @Override // defpackage.kv1
            public void bind(m85 m85Var, g87 g87Var) {
                m85Var.getClass();
                g87Var.getClass();
                m85Var.J(1, g87Var.a);
                m85Var.J(2, g87Var.b);
            }

            @Override // defpackage.kv1
            public String createQuery() {
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
            }
        };
    }

    public static final pn6 deleteByWorkSpecId$lambda$0(String str, String str2, g85 g85Var) {
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

    public static final List getTagsForWorkSpecId$lambda$0(String str, String str2, g85 g85Var) {
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

    public static final List getWorkSpecIdsWithTag$lambda$0(String str, String str2, g85 g85Var) {
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

    public static final pn6 insert$lambda$0(WorkTagDao_Impl workTagDao_Impl, g87 g87Var, g85 g85Var) {
        g85Var.getClass();
        workTagDao_Impl.__insertAdapterOfWorkTag.insert(g85Var, g87Var);
        return pn6.a;
    }

    @Override // defpackage.h87
    public void deleteByWorkSpecId(String str) {
        str.getClass();
        q23.J(this.__db, false, true, new r77(str, (byte) 18));
    }

    @Override // defpackage.h87
    public List<String> getTagsForWorkSpecId(String str) {
        str.getClass();
        return (List) q23.J(this.__db, true, false, new r77(str, (byte) 19));
    }

    public List<String> getWorkSpecIdsWithTag(String str) {
        str.getClass();
        return (List) q23.J(this.__db, true, false, new r77(str, (byte) 20));
    }

    @Override // defpackage.h87
    public void insert(g87 g87Var) {
        g87Var.getClass();
        q23.J(this.__db, false, true, new i87(this, g87Var, (byte) 0));
    }

    @Override // defpackage.h87
    public void insertTags(String str, Set set) {
        str.getClass();
        set.getClass();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            insert(new g87((String) it.next(), str));
        }
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
