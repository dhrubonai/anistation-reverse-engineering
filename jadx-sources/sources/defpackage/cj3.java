package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class cj3 {
    public static final Object j = new Object();
    public final Object a;
    public final w85 b;
    public final int c;
    public volatile Object d;
    public volatile Object e;
    public int f;
    public boolean g;
    public boolean h;
    public final la i;

    public cj3(int i) {
        yf4 yf4Var = cn7.B;
        this.a = new Object();
        this.b = new w85();
        this.c = 0;
        this.e = j;
        this.i = new la((Object) this, (byte) 3);
        this.d = yf4Var;
        this.f = 0;
    }

    public void a(Object obj) {
        boolean z;
        synchronized (this.a) {
            if (this.e == j) {
                z = true;
            } else {
                z = false;
            }
            this.e = obj;
        }
        if (!z) {
            return;
        }
        rr.n().o(this.i);
    }

    public cj3() {
        this.a = new Object();
        this.b = new w85();
        this.c = 0;
        Object obj = j;
        this.e = obj;
        this.i = new la((Object) this, (byte) 3);
        this.d = obj;
        this.f = -1;
    }
}
