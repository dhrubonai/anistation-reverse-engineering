package j3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.SubtitleView;
import c1.p1;
import c1.z0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class i0 extends FrameLayout {
    public final x A;
    public final FrameLayout B;
    public final FrameLayout C;
    public z0 D;
    public boolean E;
    public w F;
    public int G;
    public Drawable H;
    public int I;
    public boolean J;
    public CharSequence K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;

    /* renamed from: a, reason: collision with root package name */
    public final f0 f6017a;

    /* renamed from: b, reason: collision with root package name */
    public final AspectRatioFrameLayout f6018b;

    /* renamed from: c, reason: collision with root package name */
    public final View f6019c;

    /* renamed from: d, reason: collision with root package name */
    public final View f6020d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6021e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f6022f;

    /* renamed from: x, reason: collision with root package name */
    public final SubtitleView f6023x;

    /* renamed from: y, reason: collision with root package name */
    public final View f6024y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f6025z;

    public i0(Context context) {
        super(context, null, 0);
        int i10;
        int i11;
        f0 f0Var = new f0(this);
        this.f6017a = f0Var;
        if (isInEditMode()) {
            this.f6018b = null;
            this.f6019c = null;
            this.f6020d = null;
            this.f6021e = false;
            this.f6022f = null;
            this.f6023x = null;
            this.f6024y = null;
            this.f6025z = null;
            this.A = null;
            this.B = null;
            this.C = null;
            ImageView imageView = new ImageView(context);
            if (f1.b0.f3799a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(f1.b0.t(context, resources, R.drawable.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(f1.b0.t(context, resources2, R.drawable.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.exo_player_view, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f6018b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(0);
        }
        this.f6019c = findViewById(R.id.exo_shutter);
        if (aspectRatioFrameLayout != null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            SurfaceView surfaceView = new SurfaceView(context);
            if (f1.b0.f3799a >= 34) {
                e0.a(surfaceView);
            }
            this.f6020d = surfaceView;
            surfaceView.setLayoutParams(layoutParams);
            surfaceView.setOnClickListener(f0Var);
            surfaceView.setClickable(false);
            aspectRatioFrameLayout.addView(surfaceView, 0);
        } else {
            this.f6020d = null;
        }
        this.f6021e = false;
        this.B = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.C = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f6022f = imageView2;
        if (imageView2 != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.G = i10;
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f6023x = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View findViewById = findViewById(R.id.exo_buffering);
        this.f6024y = findViewById;
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        this.I = 0;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.f6025z = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        x xVar = (x) findViewById(R.id.exo_controller);
        View findViewById2 = findViewById(R.id.exo_controller_placeholder);
        if (xVar != null) {
            this.A = xVar;
        } else if (findViewById2 != null) {
            x xVar2 = new x(context);
            this.A = xVar2;
            xVar2.setId(R.id.exo_controller);
            xVar2.setLayoutParams(findViewById2.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById2.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById2);
            viewGroup.removeView(findViewById2);
            viewGroup.addView(xVar2, indexOfChild);
        } else {
            this.A = null;
        }
        x xVar3 = this.A;
        if (xVar3 != null) {
            i11 = 5000;
        } else {
            i11 = 0;
        }
        this.L = i11;
        this.O = true;
        this.M = true;
        this.N = true;
        this.E = xVar3 != null;
        if (xVar3 != null) {
            d0 d0Var = xVar3.f6104a;
            int i12 = d0Var.f5987z;
            if (i12 != 3 && i12 != 2) {
                d0Var.f();
                d0Var.i(2);
            }
            this.A.f6110d.add(f0Var);
        }
        setClickable(true);
        j();
    }

    public static void a(TextureView textureView, int i10) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i10 != 0) {
            float f10 = width / 2.0f;
            float f11 = height / 2.0f;
            matrix.postRotate(i10, f10, f11);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f10, f11);
        }
        textureView.setTransform(matrix);
    }

    public final boolean b() {
        z0 z0Var = this.D;
        if (z0Var != null && ((c1.i) z0Var).d(16) && ((j1.d0) this.D).L() && ((j1.d0) this.D).E()) {
            return true;
        }
        return false;
    }

    public final void c(boolean z9) {
        boolean z10;
        if ((!b() || !this.N) && m()) {
            x xVar = this.A;
            if (xVar.h() && xVar.getShowTimeoutMs() <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean e10 = e();
            if (z9 || z10 || e10) {
                f(e10);
            }
        }
    }

    public final boolean d(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f10 = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.G == 2) {
                    f10 = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f6018b;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f10);
                }
                ImageView imageView = this.f6022f;
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z9;
        boolean z10;
        z0 z0Var = this.D;
        if (z0Var != null && ((c1.i) z0Var).d(16) && ((j1.d0) this.D).L()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 19 && keyCode != 270 && keyCode != 22 && keyCode != 271 && keyCode != 20 && keyCode != 269 && keyCode != 21 && keyCode != 268 && keyCode != 23) {
            z9 = false;
        } else {
            z9 = true;
        }
        x xVar = this.A;
        if (z9 && m() && !xVar.h()) {
            c(true);
        } else {
            if (m() && xVar.d(keyEvent)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !super.dispatchKeyEvent(keyEvent)) {
                if (!z9 || !m()) {
                    return false;
                }
                c(true);
                return false;
            }
            c(true);
        }
        return true;
    }

    public final boolean e() {
        z0 z0Var = this.D;
        if (z0Var == null) {
            return true;
        }
        int G = ((j1.d0) z0Var).G();
        if (this.M && (!((c1.i) this.D).d(17) || !((j1.d0) this.D).A().q())) {
            if (G == 1 || G == 4) {
                return true;
            }
            z0 z0Var2 = this.D;
            z0Var2.getClass();
            if (!((j1.d0) z0Var2).E()) {
                return true;
            }
        }
        return false;
    }

    public final void f(boolean z9) {
        int i10;
        if (!m()) {
            return;
        }
        if (z9) {
            i10 = 0;
        } else {
            i10 = this.L;
        }
        x xVar = this.A;
        xVar.setShowTimeoutMs(i10);
        d0 d0Var = xVar.f6104a;
        x xVar2 = d0Var.f5963a;
        if (!xVar2.i()) {
            xVar2.setVisibility(0);
            xVar2.j();
            View view = xVar2.F;
            if (view != null) {
                view.requestFocus();
            }
        }
        d0Var.k();
    }

    public final void g() {
        if (m() && this.D != null) {
            x xVar = this.A;
            if (!xVar.h()) {
                c(true);
            } else if (this.O) {
                xVar.g();
            }
        }
    }

    public List<androidx.lifecycle.q0> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.C;
        if (frameLayout != null) {
            arrayList.add(new androidx.lifecycle.q0(frameLayout, 4, "Transparent overlay does not impact viewability"));
        }
        x xVar = this.A;
        if (xVar != null) {
            arrayList.add(new androidx.lifecycle.q0(xVar, 1, null));
        }
        return r6.o0.j(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.B;
        w7.b.x(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.G;
    }

    public boolean getControllerAutoShow() {
        return this.M;
    }

    public boolean getControllerHideOnTouch() {
        return this.O;
    }

    public int getControllerShowTimeoutMs() {
        return this.L;
    }

    public Drawable getDefaultArtwork() {
        return this.H;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.C;
    }

    public z0 getPlayer() {
        return this.D;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f6018b;
        w7.b.w(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f6023x;
    }

    @Deprecated
    public boolean getUseArtwork() {
        if (this.G != 0) {
            return true;
        }
        return false;
    }

    public boolean getUseController() {
        return this.E;
    }

    public View getVideoSurfaceView() {
        return this.f6020d;
    }

    public final void h() {
        p1 p1Var;
        float f10;
        z0 z0Var = this.D;
        if (z0Var != null) {
            j1.d0 d0Var = (j1.d0) z0Var;
            d0Var.h0();
            p1Var = d0Var.f5671d0;
        } else {
            p1Var = p1.f1878e;
        }
        int i10 = p1Var.f1879a;
        float f11 = 0.0f;
        int i11 = p1Var.f1880b;
        if (i11 != 0 && i10 != 0) {
            f10 = (i10 * p1Var.f1882d) / i11;
        } else {
            f10 = 0.0f;
        }
        View view = this.f6020d;
        if (view instanceof TextureView) {
            int i12 = p1Var.f1881c;
            if (f10 > 0.0f && (i12 == 90 || i12 == 270)) {
                f10 = 1.0f / f10;
            }
            int i13 = this.P;
            f0 f0Var = this.f6017a;
            if (i13 != 0) {
                view.removeOnLayoutChangeListener(f0Var);
            }
            this.P = i12;
            if (i12 != 0) {
                view.addOnLayoutChangeListener(f0Var);
            }
            a((TextureView) view, this.P);
        }
        if (!this.f6021e) {
            f11 = f10;
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f6018b;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (((j1.d0) r5.D).E() == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r5 = this;
            android.view.View r0 = r5.f6024y
            if (r0 == 0) goto L2d
            c1.z0 r1 = r5.D
            r2 = 0
            if (r1 == 0) goto L24
            j1.d0 r1 = (j1.d0) r1
            int r1 = r1.G()
            r3 = 2
            if (r1 != r3) goto L24
            int r1 = r5.I
            r4 = 1
            if (r1 == r3) goto L25
            if (r1 != r4) goto L24
            c1.z0 r1 = r5.D
            j1.d0 r1 = (j1.d0) r1
            boolean r1 = r1.E()
            if (r1 == 0) goto L24
            goto L25
        L24:
            r4 = r2
        L25:
            if (r4 == 0) goto L28
            goto L2a
        L28:
            r2 = 8
        L2a:
            r0.setVisibility(r2)
        L2d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.i0.i():void");
    }

    public final void j() {
        String str = null;
        x xVar = this.A;
        if (xVar != null && this.E) {
            if (xVar.h()) {
                if (this.O) {
                    str = getResources().getString(R.string.exo_controls_hide);
                }
                setContentDescription(str);
                return;
            }
            setContentDescription(getResources().getString(R.string.exo_controls_show));
            return;
        }
        setContentDescription(null);
    }

    public final void k() {
        TextView textView = this.f6025z;
        if (textView != null) {
            CharSequence charSequence = this.K;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            z0 z0Var = this.D;
            if (z0Var != null) {
                j1.d0 d0Var = (j1.d0) z0Var;
                d0Var.h0();
                j1.m mVar = d0Var.f5675f0.f5641f;
            }
            textView.setVisibility(8);
        }
    }

    public final void l(boolean z9) {
        boolean z10;
        z0 z0Var = this.D;
        View view = this.f6019c;
        boolean z11 = false;
        ImageView imageView = this.f6022f;
        if (z0Var != null) {
            c1.i iVar = (c1.i) z0Var;
            if (iVar.d(30)) {
                j1.d0 d0Var = (j1.d0) z0Var;
                if (!d0Var.B().f1836a.isEmpty()) {
                    if (z9 && !this.J && view != null) {
                        view.setVisibility(0);
                    }
                    if (d0Var.B().b(2)) {
                        if (imageView != null) {
                            imageView.setImageResource(android.R.color.transparent);
                            imageView.setVisibility(4);
                            return;
                        }
                        return;
                    }
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    if (this.G != 0) {
                        w7.b.w(imageView);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        if (iVar.d(18)) {
                            j1.d0 d0Var2 = (j1.d0) iVar;
                            d0Var2.h0();
                            byte[] bArr = d0Var2.M.f1848h;
                            if (bArr != null) {
                                z11 = d(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                            }
                        }
                        if (z11 || d(this.H)) {
                            return;
                        }
                    }
                    if (imageView != null) {
                        imageView.setImageResource(android.R.color.transparent);
                        imageView.setVisibility(4);
                        return;
                    }
                    return;
                }
            }
        }
        if (!this.J) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public final boolean m() {
        if (this.E) {
            w7.b.w(this.A);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (m() && this.D != null) {
            c(true);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        g();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i10) {
        boolean z9;
        if (i10 != 0 && this.f6022f == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        w7.b.u(z9);
        if (this.G != i10) {
            this.G = i10;
            l(false);
        }
    }

    public void setAspectRatioListener(a aVar) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f6018b;
        w7.b.w(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(aVar);
    }

    public void setControllerAnimationEnabled(boolean z9) {
        x xVar = this.A;
        w7.b.w(xVar);
        xVar.setAnimationEnabled(z9);
    }

    public void setControllerAutoShow(boolean z9) {
        this.M = z9;
    }

    public void setControllerHideDuringAds(boolean z9) {
        this.N = z9;
    }

    public void setControllerHideOnTouch(boolean z9) {
        w7.b.w(this.A);
        this.O = z9;
        j();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(m mVar) {
        x xVar = this.A;
        w7.b.w(xVar);
        xVar.setOnFullScreenModeChangedListener(mVar);
    }

    public void setControllerShowTimeoutMs(int i10) {
        x xVar = this.A;
        w7.b.w(xVar);
        this.L = i10;
        if (xVar.h()) {
            f(e());
        }
    }

    public void setControllerVisibilityListener(g0 g0Var) {
        if (g0Var != null) {
            setControllerVisibilityListener((w) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        boolean z9;
        if (this.f6025z != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        this.K = charSequence;
        k();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.H != drawable) {
            this.H = drawable;
            l(false);
        }
    }

    public void setErrorMessageProvider(c1.q qVar) {
        if (qVar != null) {
            k();
        }
    }

    public void setFullscreenButtonClickListener(h0 h0Var) {
        x xVar = this.A;
        w7.b.w(xVar);
        xVar.setOnFullScreenModeChangedListener(this.f6017a);
    }

    public void setKeepContentOnPlayerReset(boolean z9) {
        if (this.J != z9) {
            this.J = z9;
            l(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setPlayer(c1.z0 r12) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.i0.setPlayer(c1.z0):void");
    }

    public void setRepeatToggleModes(int i10) {
        x xVar = this.A;
        w7.b.w(xVar);
        xVar.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f6018b;
        w7.b.w(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.I != i10) {
            this.I = i10;
            i();
        }
    }

    public void setShowFastForwardButton(boolean z9) {
        x xVar = this.A;
        w7.b.w(xVar);
        xVar.setShowFastForwardButton(z9);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z9) {
        x xVar = this.A;
        w7.b.w(xVar);
        xVar.setShowMultiWindowTimeBar(z9);
    }

    public void setShowNextButton(boolean z9) {
        x xVar = this.A;
        w7.b.w(xVar);
        xVar.setShowNextButton(z9);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z9) {
        x xVar = this.A;
        w7.b.w(xVar);
        xVar.setShowPlayButtonIfPlaybackIsSuppressed(z9);
    }

    public void setShowPreviousButton(boolean z9) {
        x xVar = this.A;
        w7.b.w(xVar);
        xVar.setShowPreviousButton(z9);
    }

    public void setShowRewindButton(boolean z9) {
        x xVar = this.A;
        w7.b.w(xVar);
        xVar.setShowRewindButton(z9);
    }

    public void setShowShuffleButton(boolean z9) {
        x xVar = this.A;
        w7.b.w(xVar);
        xVar.setShowShuffleButton(z9);
    }

    public void setShowSubtitleButton(boolean z9) {
        x xVar = this.A;
        w7.b.w(xVar);
        xVar.setShowSubtitleButton(z9);
    }

    public void setShowVrButton(boolean z9) {
        x xVar = this.A;
        w7.b.w(xVar);
        xVar.setShowVrButton(z9);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f6019c;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z9) {
        setArtworkDisplayMode(!z9 ? 1 : 0);
    }

    public void setUseController(boolean z9) {
        boolean z10;
        boolean z11 = false;
        x xVar = this.A;
        if (z9 && xVar == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        w7.b.u(z10);
        if (z9 || hasOnClickListeners()) {
            z11 = true;
        }
        setClickable(z11);
        if (this.E == z9) {
            return;
        }
        this.E = z9;
        if (m()) {
            xVar.setPlayer(this.D);
        } else if (xVar != null) {
            xVar.g();
            xVar.setPlayer(null);
        }
        j();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f6020d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(w wVar) {
        x xVar = this.A;
        w7.b.w(xVar);
        w wVar2 = this.F;
        if (wVar2 == wVar) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = xVar.f6110d;
        if (wVar2 != null) {
            copyOnWriteArrayList.remove(wVar2);
        }
        this.F = wVar;
        if (wVar != null) {
            copyOnWriteArrayList.add(wVar);
            setControllerVisibilityListener((g0) null);
        }
    }
}
