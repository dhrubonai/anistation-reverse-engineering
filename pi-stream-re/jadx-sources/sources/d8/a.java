package d8;

import android.widget.TextView;
import com.google.android.gms.common.api.internal.i0;
import l8.z;
import m8.h;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3239a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3240b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3241c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3242d;

    public /* synthetic */ a(int i10, Object obj, String str, boolean z9) {
        this.f3239a = i10;
        this.f3242d = obj;
        this.f3240b = z9;
        this.f3241c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3239a;
        boolean z9 = this.f3240b;
        String str = this.f3241c;
        float f10 = 1.0f;
        Object obj = this.f3242d;
        switch (i10) {
            case 0:
                h hVar = ((m8.a) obj).f7557b;
                hVar.f7609g = false;
                hVar.f7613k.setText("Submit report");
                hVar.f7613k.setAlpha(1.0f);
                z zVar = hVar.f7604b;
                zVar.m(str);
                if (z9) {
                    zVar.f7036b.S();
                    return;
                }
                return;
            default:
                i0 i0Var = (i0) obj;
                i0Var.getClass();
                try {
                    ((TextView) i0Var.f2435e).setEnabled(z9);
                    TextView textView = (TextView) i0Var.f2435e;
                    if (!z9) {
                        f10 = 0.5f;
                    }
                    textView.setAlpha(f10);
                    if (str != null) {
                        ((TextView) i0Var.f2435e).setText(str);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
