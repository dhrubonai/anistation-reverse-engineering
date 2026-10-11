package defpackage;

import java.util.function.IntConsumer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class xo implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ IntConsumer y;
    public final /* synthetic */ int z;

    public /* synthetic */ xo(IntConsumer intConsumer, int i, byte b) {
        this.x = b;
        this.y = intConsumer;
        this.z = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        int i = this.z;
        IntConsumer intConsumer = this.y;
        switch (b) {
            case 0:
                intConsumer.accept(i);
                return;
            default:
                intConsumer.accept(i);
                return;
        }
    }
}
