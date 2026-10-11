package defpackage;

import java.util.HashSet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class df7 extends j18 {
    public String A;
    public HashSet B;
    public js C;
    public Long D;
    public Long E;

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final java.util.ArrayList P(java.lang.String r37, java.util.List r38, java.util.List r39, java.lang.Long r40, java.lang.Long r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 2753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.df7.P(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.ArrayList");
    }

    public final v98 Q(Integer num) {
        if (this.C.containsKey(num)) {
            return (v98) this.C.get(num);
        }
        v98 v98Var = new v98(this, this.A);
        this.C.put(num, v98Var);
        return v98Var;
    }
}
