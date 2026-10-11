package g;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

/* loaded from: classes.dex */
public final class d implements TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public int[] f4123a;

    /* renamed from: b, reason: collision with root package name */
    public int f4124b;

    /* renamed from: c, reason: collision with root package name */
    public int f4125c;

    public d(AnimationDrawable animationDrawable, boolean z9) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        this.f4124b = numberOfFrames;
        int[] iArr = this.f4123a;
        if (iArr == null || iArr.length < numberOfFrames) {
            this.f4123a = new int[numberOfFrames];
        }
        int[] iArr2 = this.f4123a;
        int i10 = 0;
        for (int i11 = 0; i11 < numberOfFrames; i11++) {
            int duration = animationDrawable.getDuration(z9 ? (numberOfFrames - i11) - 1 : i11);
            iArr2[i11] = duration;
            i10 += duration;
        }
        this.f4125c = i10;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        float f11;
        int i10 = (int) ((f10 * this.f4125c) + 0.5f);
        int i11 = this.f4124b;
        int[] iArr = this.f4123a;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = iArr[i12];
            if (i10 < i13) {
                break;
            }
            i10 -= i13;
            i12++;
        }
        if (i12 < i11) {
            f11 = i10 / this.f4125c;
        } else {
            f11 = 0.0f;
        }
        return (i12 / i11) + f11;
    }
}
