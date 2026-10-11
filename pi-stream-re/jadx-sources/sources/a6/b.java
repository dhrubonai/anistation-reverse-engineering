package a6;

import android.content.Context;
import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f112b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f111a = i10;
        this.f112b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
        int i10 = this.f111a;
        Object obj = this.f112b;
        switch (i10) {
            case 0:
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) obj).f2700z;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z9);
                    return;
                }
                return;
            default:
                com.bumptech.glide.c.b0((Context) obj).edit().putBoolean("download_wifi_only", z9).apply();
                return;
        }
    }
}
