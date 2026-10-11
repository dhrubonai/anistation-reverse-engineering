package z7;

import android.content.Context;
import msr.pistream.app.download.PiStreamDownloadService;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12120b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f12121c;

    public /* synthetic */ e(f fVar, Context context, String str) {
        this.f12121c = fVar;
        this.f12119a = context;
        this.f12120b = str;
    }

    public final void a(int i10) {
        String str = this.f12120b;
        Context context = this.f12119a;
        b b10 = d.b(context, str);
        if (b10 != null) {
            b10.f12098r = Math.min(99, i10);
            d.c(context, b10);
            this.f12121c.l();
            PiStreamDownloadService.refresh(context);
        }
    }

    public final void b(int i10, int i11) {
        String str = this.f12120b;
        Context context = this.f12119a;
        b b10 = d.b(context, str);
        if (b10 != null && "subs".equals(b10.f12105y)) {
            b10.f12106z = i10;
            b10.A = i11;
            d.c(context, b10);
            this.f12121c.l();
            PiStreamDownloadService.refresh(context);
        }
    }
}
