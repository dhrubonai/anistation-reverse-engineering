package defpackage;

import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ta1 extends jy5 {
    public final Object a = new Object();
    public final ExecutorService b = Executors.newFixedThreadPool(4, new sa1());
    public volatile Handler c;
}
