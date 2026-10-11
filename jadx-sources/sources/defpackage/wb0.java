package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class wb0 {
    public final bs a;
    public int b;

    public wb0(byte b) {
        switch (b) {
            case 1:
                this.a = new bs();
                return;
            default:
                this.a = new bs();
                return;
        }
    }

    public void a(byte[] bArr) {
        synchronized (this) {
            int i = this.b;
            if (bArr.length + i < ks.a) {
                this.b = i + (bArr.length / 2);
                this.a.addLast(bArr);
            }
        }
    }

    public void b(char[] cArr) {
        cArr.getClass();
        synchronized (this) {
            int i = this.b;
            if (cArr.length + i < ks.a) {
                this.b = i + cArr.length;
                this.a.addLast(cArr);
            }
        }
    }

    public byte[] c(int i) {
        byte[] bArr;
        Object removeLast;
        synchronized (this) {
            bs bsVar = this.a;
            bArr = null;
            if (bsVar.isEmpty()) {
                removeLast = null;
            } else {
                removeLast = bsVar.removeLast();
            }
            byte[] bArr2 = (byte[]) removeLast;
            if (bArr2 != null) {
                this.b -= bArr2.length / 2;
                bArr = bArr2;
            }
        }
        if (bArr == null) {
            return new byte[i];
        }
        return bArr;
    }

    public char[] d(int i) {
        char[] cArr;
        Object removeLast;
        synchronized (this) {
            bs bsVar = this.a;
            cArr = null;
            if (bsVar.isEmpty()) {
                removeLast = null;
            } else {
                removeLast = bsVar.removeLast();
            }
            char[] cArr2 = (char[]) removeLast;
            if (cArr2 != null) {
                this.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            return new char[i];
        }
        return cArr;
    }
}
