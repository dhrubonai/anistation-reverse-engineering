package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class cl0 implements gs4 {
    public static cl0 a(String str) {
        int length = str.length();
        if (length != 0) {
            byte b = 0;
            if (length != 1) {
                if (length != 2) {
                    return new xk0(str);
                }
                return new al0(str.charAt(0), str.charAt(1));
            }
            return new zk0(str.charAt(0), b);
        }
        return wk0.C;
    }

    public static String d(char c) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public abstract boolean b(char c);

    public cl0 c() {
        return new xk0(this);
    }
}
