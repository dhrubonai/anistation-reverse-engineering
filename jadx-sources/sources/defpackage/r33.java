package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r33 extends ho6 {
    public final /* synthetic */ byte A;
    public final Iterator B;
    public final /* synthetic */ Object C;
    public int y;
    public Object z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r33(al5 al5Var) {
        this();
        this.A = (byte) 1;
        this.C = al5Var;
        this.B = al5Var.z.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z;
        Object next;
        if (this.y != 4) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        int B = h11.B(this.y);
        if (B == 0) {
            return true;
        }
        if (B != 2) {
            this.y = 4;
            byte b = this.A;
            Object obj = null;
            Object obj2 = this.C;
            Iterator it = this.B;
            switch (b) {
                case 0:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((gs4) obj2).apply(next)) {
                            obj = next;
                            break;
                        }
                    }
                    this.y = 3;
                    break;
                case 1:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((al5) obj2).A.contains(next)) {
                            obj = next;
                            break;
                        }
                    }
                    this.y = 3;
                    break;
                default:
                    while (it.hasNext()) {
                        next = it.next();
                        if (!((oq5) ((al5) obj2).A).A.equals(next)) {
                            obj = next;
                            break;
                        }
                    }
                    this.y = 3;
                    break;
            }
            this.z = obj;
            if (this.y != 3) {
                this.y = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.y = 2;
            Object obj = this.z;
            this.z = null;
            return obj;
        }
        qi2.e();
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r33(Iterator it, gs4 gs4Var) {
        this();
        this.A = (byte) 0;
        this.B = it;
        this.C = gs4Var;
    }

    public r33() {
        super((byte) 0);
        this.y = 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r33(al5 al5Var, byte b) {
        this();
        this.A = (byte) 2;
        this.C = al5Var;
        this.B = al5Var.z.iterator();
    }
}
