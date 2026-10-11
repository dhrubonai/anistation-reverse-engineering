package defpackage;

import android.content.Context;
import android.graphics.Point;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class m60 extends op5 {
    public final Context n;
    public final int o;

    public m60(Context context) {
        super(new q61[1], new l60[1]);
        this.n = context;
        this.o = -1;
    }

    @Override // defpackage.op5
    public final r61 g() {
        return new l60(this);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [o61, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r6v2, types: [o61, java.lang.Exception] */
    @Override // defpackage.op5
    public final o61 i(q61 q61Var, r61 r61Var, boolean z) {
        boolean z2;
        l60 l60Var = (l60) r61Var;
        ByteBuffer byteBuffer = q61Var.B;
        byteBuffer.getClass();
        io3.B(byteBuffer.hasArray());
        if (byteBuffer.arrayOffset() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        io3.n(z2);
        try {
            int i = this.o;
            if (i == -1) {
                Context context = this.n;
                if (context != null) {
                    Point y = eq6.y(context);
                    int i2 = y.x;
                    int i3 = y.y;
                    ea2 ea2Var = q61Var.z;
                    if (ea2Var != null) {
                        int i4 = ea2Var.R;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                        int i5 = ea2Var.S;
                        if (i5 != -1) {
                            i3 *= i5;
                        }
                    }
                    i = (Math.max(i2, i3) * 2) - 1;
                } else {
                    i = CodedOutputStream.DEFAULT_BUFFER_SIZE;
                }
            }
            l60Var.B = oi4.m(byteBuffer.array(), byteBuffer.remaining(), null, i);
            l60Var.z = q61Var.D;
            return null;
        } catch (bj4 e) {
            return new Exception("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new Exception(e2);
        }
    }
}
