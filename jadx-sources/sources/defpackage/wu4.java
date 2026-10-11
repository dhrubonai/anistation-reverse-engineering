package defpackage;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class wu4 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Context y;

    public /* synthetic */ wu4(Context context, byte b) {
        this.x = b;
        this.y = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        Context context = this.y;
        switch (b) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new wu4(context, (byte) 1));
                return;
            default:
                h41.o0(context, new qr((byte) 2), h41.d, false);
                return;
        }
    }
}
