package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uv1 implements x73 {
    public final Enum[] a;
    public final d46 b;

    public uv1(String str, Enum[] enumArr) {
        enumArr.getClass();
        this.a = enumArr;
        this.b = new d46(new va1(this, str, (byte) 5));
    }

    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        int t = l61Var.t(getDescriptor());
        Enum[] enumArr = this.a;
        if (t >= 0 && t < enumArr.length) {
            return enumArr[t];
        }
        throw new IllegalArgumentException(t + " is not among valid " + getDescriptor().a() + " enum values, values size is " + enumArr.length);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return (aj5) this.b.getValue();
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        Enum r5 = (Enum) obj;
        r5.getClass();
        Enum[] enumArr = this.a;
        int N0 = ms.N0(enumArr, r5);
        if (N0 != -1) {
            wt1Var.l(getDescriptor(), N0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r5);
        String a = getDescriptor().a();
        String arrays = Arrays.toString(enumArr);
        arrays.getClass();
        sb.append(" is not a valid enum ");
        sb.append(a);
        sb.append(", must be one of ");
        sb.append(arrays);
        throw new IllegalArgumentException(sb.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().a() + '>';
    }
}
