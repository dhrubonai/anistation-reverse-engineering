package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.l;
import com.google.protobuf.u1;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k75 implements Iterator {
    public final ArrayDeque x;
    public l y;

    public k75(ByteString byteString) {
        if (byteString instanceof u1) {
            u1 u1Var = (u1) byteString;
            ArrayDeque arrayDeque = new ArrayDeque(u1Var.B);
            this.x = arrayDeque;
            arrayDeque.push(u1Var);
            ByteString byteString2 = u1Var.y;
            while (byteString2 instanceof u1) {
                u1 u1Var2 = (u1) byteString2;
                this.x.push(u1Var2);
                byteString2 = u1Var2.y;
            }
            this.y = (l) byteString2;
            return;
        }
        this.x = null;
        this.y = (l) byteString;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l next() {
        l lVar = this.y;
        l lVar2 = null;
        if (lVar == null) {
            qi2.e();
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque = this.x;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            ByteString byteString = ((u1) arrayDeque.pop()).z;
            while (byteString instanceof u1) {
                u1 u1Var = (u1) byteString;
                arrayDeque.push(u1Var);
                byteString = u1Var.y;
            }
            l lVar3 = (l) byteString;
            if (!lVar3.isEmpty()) {
                lVar2 = lVar3;
                break;
            }
        }
        this.y = lVar2;
        return lVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.y != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
