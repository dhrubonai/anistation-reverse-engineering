package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class xk0 extends cl0 {
    public final /* synthetic */ byte x = 1;
    public final Object y;

    public xk0(String str) {
        char[] charArray = str.toString().toCharArray();
        this.y = charArray;
        Arrays.sort(charArray);
    }

    @Override // defpackage.gs4
    public final boolean apply(Object obj) {
        switch (this.x) {
            case 0:
                return b(((Character) obj).charValue());
            default:
                return b(((Character) obj).charValue());
        }
    }

    @Override // defpackage.cl0
    public final boolean b(char c) {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                if (Arrays.binarySearch((char[]) obj, c) >= 0) {
                    return true;
                }
                return false;
            default:
                return !((cl0) obj).b(c);
        }
    }

    @Override // defpackage.cl0
    public cl0 c() {
        switch (this.x) {
            case 1:
                return (cl0) this.y;
            default:
                return super.c();
        }
    }

    public final String toString() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
                for (char c : (char[]) obj) {
                    sb.append(cl0.d(c));
                }
                sb.append("\")");
                return sb.toString();
            default:
                return ((cl0) obj) + ".negate()";
        }
    }

    public xk0(cl0 cl0Var) {
        this.y = cl0Var;
    }
}
