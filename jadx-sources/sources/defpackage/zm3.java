package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class zm3 {
    public Object A;
    public int x;
    public int y;
    public int z;

    public zm3() {
        if (xb5.y == null) {
            xb5.y = new xb5((byte) 7);
        }
    }

    public int a(int i) {
        if (i < this.z) {
            return ((ByteBuffer) this.A).getShort(this.y + i);
        }
        return 0;
    }

    public void b() {
        if (((an3) this.A).E == this.z) {
            return;
        }
        ze0.j();
    }

    public void c() {
        while (true) {
            int i = this.x;
            an3 an3Var = (an3) this.A;
            if (i < an3Var.C && an3Var.z[i] < 0) {
                this.x = i + 1;
            } else {
                return;
            }
        }
    }

    public boolean hasNext() {
        if (this.x < ((an3) this.A).C) {
            return true;
        }
        return false;
    }

    public void remove() {
        an3 an3Var = (an3) this.A;
        b();
        if (this.y != -1) {
            an3Var.c();
            an3Var.k(this.y);
            this.y = -1;
            this.z = an3Var.E;
            return;
        }
        ze0.m("Call next() before removing element from the iterator.");
    }
}
