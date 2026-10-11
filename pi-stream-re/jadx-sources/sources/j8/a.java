package j8;

import android.widget.SeekBar;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class a implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f6270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f6271b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int[] f6272c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f6273d;

    public a(int[] iArr, TextView textView, int[] iArr2, String str) {
        this.f6270a = iArr;
        this.f6271b = textView;
        this.f6272c = iArr2;
        this.f6273d = str;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i10, boolean z9) {
        this.f6270a[0] = i10;
        this.f6271b.setText(this.f6272c[i10] + this.f6273d);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
