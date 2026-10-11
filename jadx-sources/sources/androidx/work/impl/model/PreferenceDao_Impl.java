package androidx.work.impl.model;

import defpackage.cj3;
import defpackage.e73;
import defpackage.g85;
import defpackage.kv1;
import defpackage.m85;
import defpackage.ns4;
import defpackage.nt1;
import defpackage.os4;
import defpackage.pn6;
import defpackage.q23;
import defpackage.q71;
import defpackage.r82;
import defpackage.v65;
import defpackage.zg;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class PreferenceDao_Impl implements os4 {
    public static final Companion Companion = new Companion(null);
    private final v65 __db;
    private final kv1 __insertAdapterOfPreference;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* renamed from: androidx.work.impl.model.PreferenceDao_Impl$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kv1 {
        @Override // defpackage.kv1
        public void bind(m85 m85Var, ns4 ns4Var) {
            m85Var.getClass();
            ns4Var.getClass();
            m85Var.J(1, ns4Var.a);
            m85Var.e(2, ns4Var.b.longValue());
        }

        @Override // defpackage.kv1
        public String createQuery() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }
    }

    public PreferenceDao_Impl(v65 v65Var) {
        v65Var.getClass();
        this.__db = v65Var;
        this.__insertAdapterOfPreference = new kv1() { // from class: androidx.work.impl.model.PreferenceDao_Impl.1
            @Override // defpackage.kv1
            public void bind(m85 m85Var, ns4 ns4Var) {
                m85Var.getClass();
                ns4Var.getClass();
                m85Var.J(1, ns4Var.a);
                m85Var.e(2, ns4Var.b.longValue());
            }

            @Override // defpackage.kv1
            public String createQuery() {
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            }
        };
    }

    public static final Long getLongValue$lambda$0(String str, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            Long l = null;
            if (s0.p0() && !s0.isNull(0)) {
                l = Long.valueOf(s0.getLong(0));
            }
            return l;
        } finally {
            s0.close();
        }
    }

    public static final Long getObservableLongValue$lambda$0(String str, String str2, g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0(str);
        try {
            s0.J(1, str2);
            Long l = null;
            if (s0.p0() && !s0.isNull(0)) {
                l = Long.valueOf(s0.getLong(0));
            }
            return l;
        } finally {
            s0.close();
        }
    }

    public static final pn6 insertPreference$lambda$0(PreferenceDao_Impl preferenceDao_Impl, ns4 ns4Var, g85 g85Var) {
        g85Var.getClass();
        preferenceDao_Impl.__insertAdapterOfPreference.insert(g85Var, ns4Var);
        return pn6.a;
    }

    @Override // defpackage.os4
    public Long getLongValue(String str) {
        str.getClass();
        return (Long) q23.J(this.__db, true, false, new zg(str, (byte) 17));
    }

    public cj3 getObservableLongValue(String str) {
        str.getClass();
        return this.__db.getInvalidationTracker().b(new String[]{"Preference"}, false, new zg(str, (byte) 16));
    }

    @Override // defpackage.os4
    public void insertPreference(ns4 ns4Var) {
        ns4Var.getClass();
        q23.J(this.__db, false, true, new r82(this, ns4Var, (byte) 21));
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
