package j8;

import android.view.View;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import m8.v0;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f6277b;

    public /* synthetic */ c(Runnable runnable, int i10) {
        this.f6276a = i10;
        this.f6277b = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f6276a;
        Runnable runnable = this.f6277b;
        switch (i10) {
            case 0:
                runnable.run();
                return;
            case 1:
                runnable.run();
                return;
            case 2:
                runnable.run();
                return;
            case 3:
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                int[] iArr = v0.f7722a;
                runnable.run();
                return;
            case 5:
                int[] iArr2 = v0.f7722a;
                runnable.run();
                return;
            case 6:
                runnable.run();
                return;
            case zzaja.zze.zzg /* 7 */:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
