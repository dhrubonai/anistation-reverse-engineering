package h8;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.ImageView;
import java.util.List;
import msr.pistream.app.ui.home.screens.MainActivity;

/* loaded from: classes.dex */
public final class j implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f5044b;

    public /* synthetic */ j(k kVar, int i10) {
        this.f5043a = i10;
        this.f5044b = kVar;
    }

    public final void a() {
        try {
            k kVar = this.f5044b;
            int i10 = k.J0;
            Context context = kVar.f4484m0;
            androidx.fragment.app.b0 d10 = kVar.d();
            context.startActivity(new Intent(context, (Class<?>) MainActivity.class).setAction("pistream.show_downloads").addFlags(67108864));
            if (d10 != null) {
                d10.finish();
            }
        } catch (Exception e10) {
            Log.e("Detail", "openDownloads", e10);
        }
    }

    @Override // h8.d0
    public final a8.b b() {
        int i10 = this.f5043a;
        k kVar = this.f5044b;
        switch (i10) {
            case 3:
                return kVar.B0;
            case 4:
                return kVar.B0;
            default:
                return kVar.B0;
        }
    }

    @Override // h8.d0
    public final List c() {
        int i10 = this.f5043a;
        k kVar = this.f5044b;
        switch (i10) {
            case 3:
                return kVar.C0;
            default:
                return kVar.C0;
        }
    }

    @Override // h8.d0
    public final void d(boolean z9) {
        int i10;
        ImageView imageView = this.f5044b.f5053v0.f5065e;
        if (imageView != null) {
            if (z9) {
                i10 = w8.i.f11065e;
            } else {
                i10 = -1;
            }
            imageView.setColorFilter(i10);
        }
    }

    @Override // h8.d0
    public final Context getContext() {
        int i10 = this.f5043a;
        k kVar = this.f5044b;
        switch (i10) {
            case 0:
                int i11 = k.J0;
                return kVar.f4484m0;
            case 1:
                int i12 = k.J0;
                return kVar.f4484m0;
            case 2:
                int i13 = k.J0;
                return kVar.f4484m0;
            case 3:
                int i14 = k.J0;
                return kVar.f4484m0;
            case 4:
                int i15 = k.J0;
                return kVar.f4484m0;
            default:
                int i16 = k.J0;
                return kVar.f4484m0;
        }
    }
}
