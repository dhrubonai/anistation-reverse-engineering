package n8;

import android.widget.SeekBar;
import j1.d0;

/* loaded from: classes.dex */
public final class s implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f8049a;

    public s(t tVar) {
        this.f8049a = tVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i10, boolean z9) {
        t tVar = this.f8049a;
        j1.p f10 = tVar.f8072x.f();
        if (z9 && f10 != null) {
            d0 d0Var = (d0) f10;
            if (d0Var.D() > 0) {
                tVar.f8057h.setText(com.bumptech.glide.d.v((d0Var.D() * i10) / 1000));
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f8049a.f8072x.f8024b.F0 = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        t tVar = this.f8049a;
        Object f10 = tVar.f8072x.f();
        if (f10 != null) {
            d0 d0Var = (d0) f10;
            if (d0Var.D() > 0) {
                ((c1.i) f10).j(5, (d0Var.D() * seekBar.getProgress()) / 1000);
            }
        }
        tVar.f8072x.f8024b.F0 = false;
    }
}
