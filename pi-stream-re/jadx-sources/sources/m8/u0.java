package m8;

import android.widget.SeekBar;
import android.widget.TextView;
import java.util.function.IntConsumer;

/* loaded from: classes.dex */
public final class u0 implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f7716b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7717c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IntConsumer f7718d;

    public u0(int i10, TextView textView, String str, m0 m0Var) {
        this.f7715a = i10;
        this.f7716b = textView;
        this.f7717c = str;
        this.f7718d = m0Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i10, boolean z9) {
        int i11 = this.f7715a + i10;
        this.f7716b.setText(i11 + this.f7717c);
        this.f7718d.accept(i11);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
