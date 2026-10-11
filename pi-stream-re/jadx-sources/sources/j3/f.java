package j3;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import c1.e1;
import c1.z0;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class f extends View implements p0 {

    /* renamed from: j0, reason: collision with root package name */
    public static final /* synthetic */ int f5990j0 = 0;
    public final Paint A;
    public final Drawable B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final StringBuilder L;
    public final Formatter M;
    public final androidx.activity.b N;
    public final CopyOnWriteArraySet O;
    public final Point P;
    public final float Q;
    public int R;
    public long S;
    public int T;
    public Rect U;
    public final ValueAnimator V;
    public float W;

    /* renamed from: a, reason: collision with root package name */
    public final Rect f5991a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f5992a0;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f5993b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f5994b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f5995c;

    /* renamed from: c0, reason: collision with root package name */
    public long f5996c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f5997d;

    /* renamed from: d0, reason: collision with root package name */
    public long f5998d0;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f5999e;

    /* renamed from: e0, reason: collision with root package name */
    public long f6000e0;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f6001f;

    /* renamed from: f0, reason: collision with root package name */
    public long f6002f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f6003g0;

    /* renamed from: h0, reason: collision with root package name */
    public long[] f6004h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean[] f6005i0;

    /* renamed from: x, reason: collision with root package name */
    public final Paint f6006x;

    /* renamed from: y, reason: collision with root package name */
    public final Paint f6007y;

    /* renamed from: z, reason: collision with root package name */
    public final Paint f6008z;

    public f(Context context) {
        super(context, null, 0);
        this.f5991a = new Rect();
        this.f5993b = new Rect();
        this.f5995c = new Rect();
        this.f5997d = new Rect();
        Paint paint = new Paint();
        this.f5999e = paint;
        Paint paint2 = new Paint();
        this.f6001f = paint2;
        Paint paint3 = new Paint();
        this.f6006x = paint3;
        Paint paint4 = new Paint();
        this.f6007y = paint4;
        Paint paint5 = new Paint();
        this.f6008z = paint5;
        Paint paint6 = new Paint();
        this.A = paint6;
        paint6.setAntiAlias(true);
        this.O = new CopyOnWriteArraySet();
        this.P = new Point();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.Q = f10;
        this.K = a(-50, f10);
        int a10 = a(4, f10);
        int a11 = a(26, f10);
        int a12 = a(4, f10);
        int a13 = a(12, f10);
        int a14 = a(0, f10);
        int a15 = a(16, f10);
        this.C = a10;
        this.D = a11;
        this.E = 0;
        this.F = a12;
        this.G = a13;
        this.H = a14;
        this.I = a15;
        paint.setColor(-1);
        paint6.setColor(-1);
        paint2.setColor(-855638017);
        paint3.setColor(872415231);
        paint4.setColor(-1291845888);
        paint5.setColor(872414976);
        this.B = null;
        StringBuilder sb = new StringBuilder();
        this.L = sb;
        this.M = new Formatter(sb, Locale.getDefault());
        this.N = new androidx.activity.b(this, 13);
        this.J = (Math.max(a14, Math.max(a13, a15)) + 1) / 2;
        this.W = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.V = valueAnimator;
        valueAnimator.addUpdateListener(new e(this, 0));
        this.f5998d0 = -9223372036854775807L;
        this.S = -9223372036854775807L;
        this.R = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int a(int i10, float f10) {
        return (int) ((i10 * f10) + 0.5f);
    }

    private long getPositionIncrement() {
        long j4 = this.S;
        if (j4 == -9223372036854775807L) {
            long j10 = this.f5998d0;
            if (j10 == -9223372036854775807L) {
                return 0L;
            }
            return j10 / this.R;
        }
        return j4;
    }

    private String getProgressText() {
        return f1.b0.C(this.L, this.M, this.f6000e0);
    }

    private long getScrubberPosition() {
        if (this.f5993b.width() > 0 && this.f5998d0 != -9223372036854775807L) {
            return (this.f5997d.width() * this.f5998d0) / r0.width();
        }
        return 0L;
    }

    public final boolean b(long j4) {
        long j10;
        long j11 = this.f5998d0;
        if (j11 <= 0) {
            return false;
        }
        if (this.f5994b0) {
            j10 = this.f5996c0;
        } else {
            j10 = this.f6000e0;
        }
        long j12 = j10;
        long i10 = f1.b0.i(j12 + j4, 0L, j11);
        if (i10 == j12) {
            return false;
        }
        if (!this.f5994b0) {
            c(i10);
        } else {
            f(i10);
        }
        e();
        return true;
    }

    public final void c(long j4) {
        this.f5996c0 = j4;
        this.f5994b0 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.O.iterator();
        while (it.hasNext()) {
            x xVar = ((l) it.next()).f6037a;
            xVar.F0 = true;
            TextView textView = xVar.U;
            if (textView != null) {
                textView.setText(f1.b0.C(xVar.W, xVar.f6105a0, j4));
            }
            xVar.f6104a.f();
        }
    }

    public final void d(boolean z9) {
        z0 z0Var;
        removeCallbacks(this.N);
        this.f5994b0 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.O.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            long j4 = this.f5996c0;
            x xVar = lVar.f6037a;
            xVar.F0 = false;
            if (!z9 && (z0Var = xVar.f6136y0) != null) {
                if (xVar.E0) {
                    c1.i iVar = (c1.i) z0Var;
                    if (iVar.d(17) && iVar.d(10)) {
                        e1 A = ((j1.d0) iVar).A();
                        int p3 = A.p();
                        int i10 = 0;
                        while (true) {
                            long c02 = f1.b0.c0(A.n(i10, xVar.f6109c0).f1668n);
                            if (j4 < c02) {
                                break;
                            }
                            if (i10 == p3 - 1) {
                                j4 = c02;
                                break;
                            } else {
                                j4 -= c02;
                                i10++;
                            }
                        }
                        iVar.i(i10, j4, false);
                    }
                } else {
                    c1.i iVar2 = (c1.i) z0Var;
                    if (iVar2.d(5)) {
                        iVar2.j(5, j4);
                    }
                }
                xVar.o();
            }
            xVar.f6104a.g();
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.B;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e() {
        long j4;
        Rect rect = this.f5995c;
        Rect rect2 = this.f5993b;
        rect.set(rect2);
        Rect rect3 = this.f5997d;
        rect3.set(rect2);
        if (this.f5994b0) {
            j4 = this.f5996c0;
        } else {
            j4 = this.f6000e0;
        }
        if (this.f5998d0 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.f6002f0) / this.f5998d0)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j4) / this.f5998d0)), rect2.right);
        } else {
            int i10 = rect2.left;
            rect.right = i10;
            rect3.right = i10;
        }
        invalidate(this.f5991a);
    }

    public final void f(long j4) {
        if (this.f5996c0 == j4) {
            return;
        }
        this.f5996c0 = j4;
        Iterator it = this.O.iterator();
        while (it.hasNext()) {
            x xVar = ((l) it.next()).f6037a;
            TextView textView = xVar.U;
            if (textView != null) {
                textView.setText(f1.b0.C(xVar.W, xVar.f6105a0, j4));
            }
        }
    }

    public long getPreferredUpdateDelay() {
        int width = (int) (this.f5993b.width() / this.Q);
        if (width != 0) {
            long j4 = this.f5998d0;
            if (j4 != 0 && j4 != -9223372036854775807L) {
                return j4 / width;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.B;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        int i10;
        canvas.save();
        Rect rect = this.f5993b;
        int height = rect.height();
        int centerY = rect.centerY() - (height / 2);
        int i11 = height + centerY;
        long j4 = this.f5998d0;
        Paint paint2 = this.f6006x;
        Rect rect2 = this.f5997d;
        if (j4 <= 0) {
            canvas.drawRect(rect.left, centerY, rect.right, i11, paint2);
        } else {
            Rect rect3 = this.f5995c;
            int i12 = rect3.left;
            int i13 = rect3.right;
            int max = Math.max(Math.max(rect.left, i13), rect2.right);
            int i14 = rect.right;
            if (max < i14) {
                canvas.drawRect(max, centerY, i14, i11, paint2);
            }
            int max2 = Math.max(i12, rect2.right);
            if (i13 > max2) {
                canvas.drawRect(max2, centerY, i13, i11, this.f6001f);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, centerY, rect2.right, i11, this.f5999e);
            }
            if (this.f6003g0 != 0) {
                long[] jArr = this.f6004h0;
                jArr.getClass();
                boolean[] zArr = this.f6005i0;
                zArr.getClass();
                int i15 = this.F;
                int i16 = i15 / 2;
                int i17 = 0;
                int i18 = 0;
                while (i18 < this.f6003g0) {
                    int min = Math.min(rect.width() - i15, Math.max(i17, ((int) ((rect.width() * f1.b0.i(jArr[i18], 0L, this.f5998d0)) / this.f5998d0)) - i16)) + rect.left;
                    if (zArr[i18]) {
                        paint = this.f6008z;
                    } else {
                        paint = this.f6007y;
                    }
                    canvas.drawRect(min, centerY, min + i15, i11, paint);
                    i18++;
                    i17 = i17;
                    i15 = i15;
                }
            }
        }
        if (this.f5998d0 > 0) {
            int h10 = f1.b0.h(rect2.right, rect2.left, rect.right);
            int centerY2 = rect2.centerY();
            Drawable drawable = this.B;
            if (drawable == null) {
                if (!this.f5994b0 && !isFocused()) {
                    if (isEnabled()) {
                        i10 = this.G;
                    } else {
                        i10 = this.H;
                    }
                } else {
                    i10 = this.I;
                }
                canvas.drawCircle(h10, centerY2, (int) ((i10 * this.W) / 2.0f), this.A);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.W)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.W)) / 2;
                drawable.setBounds(h10 - intrinsicWidth, centerY2 - intrinsicHeight, h10 + intrinsicWidth, centerY2 + intrinsicHeight);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z9, int i10, Rect rect) {
        super.onFocusChanged(z9, i10, rect);
        if (this.f5994b0 && !z9) {
            d(false);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f5998d0 <= 0) {
            return;
        }
        if (f1.b0.f3799a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L2e
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L25
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L25;
                default: goto L12;
            }
        L12:
            goto L2e
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.b(r0)
            if (r0 == 0) goto L2e
            androidx.activity.b r5 = r4.N
            r4.removeCallbacks(r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L25:
            boolean r0 = r4.f5994b0
            if (r0 == 0) goto L2e
            r5 = 0
            r4.d(r5)
            return r3
        L2e:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.f.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        Rect rect;
        int i17 = i12 - i10;
        int i18 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i17 - getPaddingRight();
        if (this.f5992a0) {
            i14 = 0;
        } else {
            i14 = this.J;
        }
        int i19 = this.E;
        int i20 = this.C;
        int i21 = this.D;
        if (i19 == 1) {
            i15 = (i18 - getPaddingBottom()) - i21;
            i16 = ((i18 - getPaddingBottom()) - i20) - Math.max(i14 - (i20 / 2), 0);
        } else {
            i15 = (i18 - i21) / 2;
            i16 = (i18 - i20) / 2;
        }
        Rect rect2 = this.f5991a;
        rect2.set(paddingLeft, i15, paddingRight, i21 + i15);
        this.f5993b.set(rect2.left + i14, i16, rect2.right - i14, i20 + i16);
        if (f1.b0.f3799a >= 29 && ((rect = this.U) == null || rect.width() != i17 || this.U.height() != i18)) {
            Rect rect3 = new Rect(0, 0, i17, i18);
            this.U = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        e();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int i12 = this.D;
        if (mode == 0) {
            size = i12;
        } else if (mode != 1073741824) {
            size = Math.min(i12, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        Drawable drawable = this.B;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        boolean z9;
        Drawable drawable = this.B;
        if (drawable != null) {
            if (f1.b0.f3799a >= 23 && drawable.setLayoutDirection(i10)) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r3 != 3) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.isEnabled()
            r1 = 0
            if (r0 == 0) goto La1
            long r2 = r9.f5998d0
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto La1
        L11:
            android.graphics.Point r0 = r9.P
            float r2 = r10.getX()
            int r2 = (int) r2
            float r3 = r10.getY()
            int r3 = (int) r3
            r0.set(r2, r3)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r10.getAction()
            android.graphics.Rect r4 = r9.f5997d
            android.graphics.Rect r5 = r9.f5993b
            r6 = 1
            if (r3 == 0) goto L7d
            r7 = 3
            if (r3 == r6) goto L6e
            r8 = 2
            if (r3 == r8) goto L38
            if (r3 == r7) goto L6e
            goto La1
        L38:
            boolean r10 = r9.f5994b0
            if (r10 == 0) goto La1
            int r10 = r9.K
            if (r0 >= r10) goto L52
            int r10 = r9.T
            int r2 = r2 - r10
            int r2 = r2 / r7
            int r2 = r2 + r10
            float r10 = (float) r2
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r10 = f1.b0.h(r10, r0, r1)
            r4.right = r10
            goto L60
        L52:
            r9.T = r2
            float r10 = (float) r2
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r10 = f1.b0.h(r10, r0, r1)
            r4.right = r10
        L60:
            long r0 = r9.getScrubberPosition()
            r9.f(r0)
            r9.e()
            r9.invalidate()
            return r6
        L6e:
            boolean r0 = r9.f5994b0
            if (r0 == 0) goto La1
            int r10 = r10.getAction()
            if (r10 != r7) goto L79
            r1 = r6
        L79:
            r9.d(r1)
            return r6
        L7d:
            float r10 = (float) r2
            float r0 = (float) r0
            int r10 = (int) r10
            int r0 = (int) r0
            android.graphics.Rect r2 = r9.f5991a
            boolean r0 = r2.contains(r10, r0)
            if (r0 == 0) goto La1
            int r0 = r5.left
            int r1 = r5.right
            int r10 = f1.b0.h(r10, r0, r1)
            r4.right = r10
            long r0 = r9.getScrubberPosition()
            r9.c(r0)
            r9.e()
            r9.invalidate()
            return r6
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.f.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.f5998d0 <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (b(-getPositionIncrement())) {
                d(false);
            }
        } else {
            if (i10 != 4096) {
                return false;
            }
            if (b(getPositionIncrement())) {
                d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i10) {
        this.f6007y.setColor(i10);
        invalidate(this.f5991a);
    }

    public void setBufferedColor(int i10) {
        this.f6001f.setColor(i10);
        invalidate(this.f5991a);
    }

    public void setBufferedPosition(long j4) {
        if (this.f6002f0 == j4) {
            return;
        }
        this.f6002f0 = j4;
        e();
    }

    public void setDuration(long j4) {
        if (this.f5998d0 == j4) {
            return;
        }
        this.f5998d0 = j4;
        if (this.f5994b0 && j4 == -9223372036854775807L) {
            d(true);
        }
        e();
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        if (this.f5994b0 && !z9) {
            d(true);
        }
    }

    public void setKeyCountIncrement(int i10) {
        boolean z9;
        if (i10 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        this.R = i10;
        this.S = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j4) {
        boolean z9;
        if (j4 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        this.R = -1;
        this.S = j4;
    }

    public void setPlayedAdMarkerColor(int i10) {
        this.f6008z.setColor(i10);
        invalidate(this.f5991a);
    }

    public void setPlayedColor(int i10) {
        this.f5999e.setColor(i10);
        invalidate(this.f5991a);
    }

    public void setPosition(long j4) {
        if (this.f6000e0 == j4) {
            return;
        }
        this.f6000e0 = j4;
        setContentDescription(getProgressText());
        e();
    }

    public void setScrubberColor(int i10) {
        this.A.setColor(i10);
        invalidate(this.f5991a);
    }

    public void setUnplayedColor(int i10) {
        this.f6006x.setColor(i10);
        invalidate(this.f5991a);
    }
}
