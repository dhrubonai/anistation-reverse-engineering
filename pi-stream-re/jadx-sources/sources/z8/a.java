package z8;

import java.util.concurrent.ThreadFactory;
import r6.h0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12132b;

    public /* synthetic */ a(String str, boolean z9) {
        this.f12131a = str;
        this.f12132b = z9;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f12131a;
        h0.u(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f12132b);
        return thread;
    }
}
