package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f663a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f664b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f665c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f666d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f667e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f668f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f669g;

    public /* synthetic */ v(TextView textView, int i10) {
        this.f663a = i10;
        this.f669g = textView;
    }

    public final void a() {
        TextView textView = this.f669g;
        Drawable a10 = k0.c.a((CompoundButton) textView);
        if (a10 != null) {
            if (this.f666d || this.f667e) {
                Drawable mutate = a10.mutate();
                if (this.f666d) {
                    a0.b.h(mutate, this.f664b);
                }
                if (this.f667e) {
                    a0.b.i(mutate, this.f665c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(((CompoundButton) textView).getDrawableState());
                }
                ((CompoundButton) textView).setButtonDrawable(mutate);
            }
        }
    }

    public final void b() {
        TextView textView = this.f669g;
        Drawable checkMarkDrawable = ((CheckedTextView) textView).getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f666d || this.f667e) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f666d) {
                    a0.b.h(mutate, this.f664b);
                }
                if (this.f667e) {
                    a0.b.i(mutate, this.f665c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(((CheckedTextView) textView).getDrawableState());
                }
                ((CheckedTextView) textView).setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0076 A[Catch: all -> 0x0097, TryCatch #1 {all -> 0x0097, blocks: (B:5:0x0032, B:7:0x0038, B:10:0x003e, B:12:0x0053, B:14:0x0059, B:16:0x005f, B:17:0x0070, B:19:0x0076, B:20:0x0080, B:22:0x0086), top: B:4:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086 A[Catch: all -> 0x0097, TRY_LEAVE, TryCatch #1 {all -> 0x0097, blocks: (B:5:0x0032, B:7:0x0038, B:10:0x003e, B:12:0x0053, B:14:0x0059, B:16:0x005f, B:17:0x0070, B:19:0x0076, B:20:0x0080, B:22:0x0086), top: B:4:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd A[Catch: all -> 0x011e, TryCatch #3 {all -> 0x011e, blocks: (B:35:0x00b9, B:37:0x00bf, B:40:0x00c5, B:42:0x00da, B:44:0x00e0, B:46:0x00e6, B:47:0x00f7, B:49:0x00fd, B:50:0x0107, B:52:0x010d), top: B:34:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010d A[Catch: all -> 0x011e, TRY_LEAVE, TryCatch #3 {all -> 0x011e, blocks: (B:35:0x00b9, B:37:0x00bf, B:40:0x00c5, B:42:0x00da, B:44:0x00e0, B:46:0x00e6, B:47:0x00f7, B:49:0x00fd, B:50:0x0107, B:52:0x010d), top: B:34:0x00b9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.util.AttributeSet r17, int r18) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.v.c(android.util.AttributeSet, int):void");
    }
}
