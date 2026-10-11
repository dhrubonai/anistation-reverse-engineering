package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pn5 implements i41 {
    public final dh2 a;
    public final ll1 b;
    public final Context c;
    public final String d;
    public final d46 e;
    public final Set f;

    public pn5(Context context, String str, Set set, dh2 dh2Var, ll1 ll1Var) {
        Set M0;
        set.getClass();
        nn5 nn5Var = new nn5(context, str, (byte) 0);
        this.a = dh2Var;
        this.b = ll1Var;
        this.c = context;
        this.d = str;
        this.e = new d46(nn5Var);
        if (set == rn5.a) {
            M0 = null;
        } else {
            M0 = yo0.M0(set);
        }
        this.f = M0;
    }

    @Override // defpackage.i41
    public final Object cleanUp(vz0 vz0Var) {
        d46 d46Var = this.e;
        SharedPreferences.Editor edit = ((SharedPreferences) d46Var.getValue()).edit();
        Set set = this.f;
        if (set == null) {
            edit.clear();
        } else {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                edit.remove((String) it.next());
            }
        }
        if (edit.commit()) {
            if (((SharedPreferences) d46Var.getValue()).getAll().isEmpty()) {
                this.c.deleteSharedPreferences(this.d);
            }
            if (set != null) {
                set.clear();
            }
            return pn6.a;
        }
        qi2.k("Unable to delete migrated keys from SharedPreferences.");
        return null;
    }

    @Override // defpackage.i41
    public final Object migrate(Object obj, vz0 vz0Var) {
        return this.b.invoke(new sn5((SharedPreferences) this.e.getValue(), this.f), obj, vz0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r4.isEmpty() == false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.i41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object shouldMigrate(java.lang.Object r5, defpackage.vz0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.on5
            if (r0 == 0) goto L13
            r0 = r6
            on5 r0 = (defpackage.on5) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L1a
        L13:
            on5 r0 = new on5
            xz0 r6 = (defpackage.xz0) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.x
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.m37.N(r6)
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.m37.N(r6)
            r0.z = r2
            dh2 r6 = r4.a
            java.lang.Object r6 = r6.invoke(r5, r0)
            w11 r5 = defpackage.w11.x
            if (r6 != r5) goto L3e
            return r5
        L3e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r5 != 0) goto L49
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L49:
            d46 r5 = r4.e
            r6 = 0
            java.util.Set r4 = r4.f
            if (r4 != 0) goto L66
            java.lang.Object r4 = r5.getValue()
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            java.util.Map r4 = r4.getAll()
            r4.getClass()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L64
            goto L92
        L64:
            r2 = r6
            goto L92
        L66:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.Object r5 = r5.getValue()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L7c
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L7c
            goto L64
        L7c:
            java.util.Iterator r4 = r4.iterator()
        L80:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L80
        L92:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pn5.shouldMigrate(java.lang.Object, vz0):java.lang.Object");
    }
}
