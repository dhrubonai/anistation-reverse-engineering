package defpackage;

import java.nio.ByteBuffer;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class em0 {
    public static final cc0 a = new cc0(128, 65536);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [qq5, java.lang.Object, oa0] */
    public static final oa0 a(cv5 cv5Var, Cipher cipher, ub2 ub2Var) {
        int i;
        cv5Var.getClass();
        ByteBuffer byteBuffer = (ByteBuffer) tr4.a.y();
        ea1 ea1Var = a;
        Object y = ea1Var.y();
        boolean z = true;
        try {
            ?? obj = new Object();
            byteBuffer.clear();
            ub2Var.invoke(obj);
            while (true) {
                if (byteBuffer.hasRemaining()) {
                    int remaining = byteBuffer.remaining();
                    mv5.f(cv5Var, byteBuffer);
                    i = remaining - byteBuffer.remaining();
                } else {
                    i = 0;
                }
                byteBuffer.flip();
                if (!byteBuffer.hasRemaining() && (i == -1 || cv5Var.D())) {
                    break;
                }
                ((ByteBuffer) y).clear();
                if (cipher.getOutputSize(byteBuffer.remaining()) > ((ByteBuffer) y).remaining()) {
                    if (z) {
                        ea1Var.i0(y);
                    }
                    Object allocate = ByteBuffer.allocate(cipher.getOutputSize(byteBuffer.remaining()));
                    allocate.getClass();
                    y = allocate;
                    z = false;
                }
                cipher.update(byteBuffer, (ByteBuffer) y);
                ((ByteBuffer) y).flip();
                ByteBuffer byteBuffer2 = (ByteBuffer) y;
                byteBuffer2.getClass();
                jf7.M(obj, byteBuffer2);
                byteBuffer.compact();
            }
            byteBuffer.hasRemaining();
            ((ByteBuffer) y).hasRemaining();
            int outputSize = cipher.getOutputSize(0);
            if (outputSize != 0) {
                if (outputSize > ((ByteBuffer) y).capacity()) {
                    byte[] doFinal = cipher.doFinal();
                    doFinal.getClass();
                    db.u0(obj, doFinal, 0, doFinal.length);
                } else {
                    ((ByteBuffer) y).clear();
                    cipher.doFinal(am0.a, (ByteBuffer) y);
                    ((ByteBuffer) y).flip();
                    if (!((ByteBuffer) y).hasRemaining()) {
                        byte[] doFinal2 = cipher.doFinal();
                        doFinal2.getClass();
                        db.u0(obj, doFinal2, 0, doFinal2.length);
                    } else {
                        ByteBuffer byteBuffer3 = (ByteBuffer) y;
                        byteBuffer3.getClass();
                        jf7.M(obj, byteBuffer3);
                    }
                }
            }
            tr4.a.i0(byteBuffer);
            if (z) {
                ea1Var.i0(y);
            }
            return obj;
        } catch (Throwable th) {
            tr4.a.i0(byteBuffer);
            if (1 != 0) {
                ea1Var.i0(y);
            }
            throw th;
        }
    }
}
