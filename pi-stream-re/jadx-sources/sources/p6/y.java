package p6;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class y extends w {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f8630x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ w f8631y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ c f8632z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c cVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, w wVar) {
        super(taskCompletionSource);
        this.f8632z = cVar;
        this.f8630x = taskCompletionSource2;
        this.f8631y = wVar;
    }

    @Override // p6.w
    public final void b() {
        synchronized (this.f8632z.f8609f) {
            c cVar = this.f8632z;
            TaskCompletionSource taskCompletionSource = this.f8630x;
            cVar.f8608e.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new z3.e(17, cVar, taskCompletionSource));
            if (this.f8632z.f8615l.getAndIncrement() > 0) {
                this.f8632z.f8605b.b("Already connected to the service.", new Object[0]);
            }
            c.b(this.f8632z, this.f8631y);
        }
    }
}
