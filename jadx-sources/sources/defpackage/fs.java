package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fs implements Iterator, j73 {
    public final /* synthetic */ byte A;
    public final /* synthetic */ Object B;
    public int x;
    public int y;
    public boolean z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fs(js jsVar, byte b) {
        this(jsVar.z);
        this.A = b;
        switch (b) {
            case 1:
                this.B = jsVar;
                this(jsVar.z);
                return;
            default:
                this.B = jsVar;
                return;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.y < this.x) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object e;
        if (hasNext()) {
            int i = this.y;
            byte b = this.A;
            Object obj = this.B;
            switch (b) {
                case 0:
                    e = ((js) obj).e(i);
                    break;
                case 1:
                    e = ((js) obj).h(i);
                    break;
                default:
                    e = ((ls) obj).y[i];
                    break;
            }
            this.y++;
            this.z = true;
            return e;
        }
        qi2.e();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.z) {
            int i = this.y - 1;
            this.y = i;
            byte b = this.A;
            Object obj = this.B;
            switch (b) {
                case 0:
                    ((js) obj).f(i);
                    break;
                case 1:
                    ((js) obj).f(i);
                    break;
                default:
                    ((ls) obj).b(i);
                    break;
            }
            this.x--;
            this.z = false;
            return;
        }
        ze0.m("Call next() before removing an element.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fs(ls lsVar) {
        this(lsVar.z);
        this.A = (byte) 2;
        this.B = lsVar;
    }

    public fs(int i) {
        this.x = i;
    }
}
