package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qf extends ThreadLocal {
    public final /* synthetic */ byte a;

    public /* synthetic */ qf(byte b) {
        this.a = b;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [fe7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [q88, java.lang.Object] */
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    sf sfVar = new sf(choreographer, Handler.createAsync(myLooper));
                    return sfVar.plus(sfVar.H);
                }
                ze0.m("no Looper on this thread");
                return null;
            case 1:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(dq6.e);
                return simpleDateFormat;
            case 2:
                return new Random();
            case 3:
                return Boolean.FALSE;
            case 4:
                ?? obj = new Object();
                obj.x = 0;
                return obj;
            case 5:
                return 0L;
            case 6:
                n77.o0(Thread.currentThread());
                ?? obj2 = new Object();
                obj2.a = false;
                obj2.b = null;
                Thread currentThread = Thread.currentThread();
                WeakHashMap weakHashMap = q78.b;
                synchronized (weakHashMap) {
                    weakHashMap.put(currentThread, obj2);
                }
                return obj2;
            default:
                return new Random();
        }
    }
}
