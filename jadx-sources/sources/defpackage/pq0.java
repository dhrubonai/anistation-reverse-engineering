package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pq0 implements Iterator {
    public final /* synthetic */ sq0 A;
    public final /* synthetic */ byte B;
    public final /* synthetic */ sq0 C;
    public int x;
    public int y;
    public int z;

    public pq0(sq0 sq0Var, byte b) {
        int i;
        this.B = b;
        this.C = sq0Var;
        this.A = sq0Var;
        this.x = sq0Var.B;
        if (sq0Var.isEmpty()) {
            i = -1;
        } else {
            i = 0;
        }
        this.y = i;
        this.z = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.y >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        sq0 sq0Var = this.A;
        if (sq0Var.B == this.x) {
            if (hasNext()) {
                int i = this.y;
                this.z = i;
                byte b = this.B;
                sq0 sq0Var2 = this.C;
                switch (b) {
                    case 0:
                        obj = sq0Var2.j()[i];
                        break;
                    case 1:
                        obj = new rq0(sq0Var2, i);
                        break;
                    default:
                        obj = sq0Var2.k()[i];
                        break;
                }
                int i2 = this.y + 1;
                if (i2 >= sq0Var.C) {
                    i2 = -1;
                }
                this.y = i2;
                return obj;
            }
            qi2.e();
            return null;
        }
        ze0.j();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        sq0 sq0Var = this.A;
        if (sq0Var.B == this.x) {
            if (this.z >= 0) {
                z = true;
            } else {
                z = false;
            }
            io3.A("no calls to next() since the last call to remove()", z);
            this.x += 32;
            int i = this.z;
            Object obj = sq0.G;
            sq0Var.remove(sq0Var.j()[i]);
            this.y--;
            this.z = -1;
            return;
        }
        ze0.j();
    }
}
