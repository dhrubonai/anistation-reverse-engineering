package d0;

import android.content.Context;
import androidx.appcompat.widget.r;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3013a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3014b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f3015c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f3016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3017e;

    public /* synthetic */ d(String str, Context context, r rVar, int i10, int i11) {
        this.f3013a = i11;
        this.f3014b = str;
        this.f3015c = context;
        this.f3016d = rVar;
        this.f3017e = i10;
    }

    public final f a() {
        int i10 = this.f3013a;
        Context context = this.f3015c;
        String str = this.f3014b;
        int i11 = this.f3017e;
        r rVar = this.f3016d;
        switch (i10) {
            case 0:
                return g.a(str, context, rVar, i11);
            default:
                try {
                    return g.a(str, context, rVar, i11);
                } catch (Throwable unused) {
                    return new f(-3);
                }
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.f3013a) {
            case 0:
                return a();
            default:
                return a();
        }
    }
}
