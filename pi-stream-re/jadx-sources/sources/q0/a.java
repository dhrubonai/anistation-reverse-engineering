package q0;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8908b;

    public /* synthetic */ a(String str, int i10) {
        this.f8907a = i10;
        this.f8908b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i10 = this.f8907a;
        String str = this.f8908b;
        switch (i10) {
            case 0:
                Thread thread = new Thread(runnable, str);
                thread.setPriority(10);
                return thread;
            default:
                int i11 = f1.b0.f3799a;
                return new Thread(runnable, str);
        }
    }
}
