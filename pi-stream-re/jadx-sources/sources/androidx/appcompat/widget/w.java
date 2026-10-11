package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f680a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f681b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f682c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f683d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f684e;

    /* renamed from: f, reason: collision with root package name */
    public Object f685f;

    /* renamed from: g, reason: collision with root package name */
    public Object f686g;

    public w(y8.q qVar, String str, y8.o oVar, y8.b0 b0Var, Map map) {
        this.f680a = 3;
        r6.h0.u(str, "method");
        this.f681b = qVar;
        this.f682c = str;
        this.f683d = oVar;
        this.f684e = b0Var;
        this.f685f = map;
    }

    public static boolean a(int[] iArr, int i10) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i10) {
        int c6 = v3.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{v3.f674b, v3.f676d, v3.f675c, v3.f678f}, new int[]{v3.b(context, R.attr.colorButtonNormal), z.a.b(c6, i10), z.a.b(c6, i10), i10});
    }

    public static LayerDrawable c(y2 y2Var, Context context, int i10) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
        Drawable f10 = y2Var.f(context, R.drawable.abc_star_black_48dp);
        Drawable f11 = y2Var.f(context, R.drawable.abc_star_half_black_48dp);
        if ((f10 instanceof BitmapDrawable) && f10.getIntrinsicWidth() == dimensionPixelSize && f10.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) f10;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            f10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f10.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((f11 instanceof BitmapDrawable) && f11.getIntrinsicWidth() == dimensionPixelSize && f11.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) f11;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            f11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f11.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void e(Drawable drawable, int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter h10;
        int[] iArr = v1.f670a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = x.f697b;
        }
        PorterDuff.Mode mode2 = x.f697b;
        synchronized (x.class) {
            h10 = y2.h(i10, mode);
        }
        mutate.setColorFilter(h10);
    }

    public final ColorStateList d(Context context, int i10) {
        if (i10 == R.drawable.abc_edit_text_material) {
            return x.j.getColorStateList(context, R.color.abc_tint_edittext);
        }
        if (i10 == R.drawable.abc_switch_track_mtrl_alpha) {
            return x.j.getColorStateList(context, R.color.abc_tint_switch_track);
        }
        if (i10 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList d10 = v3.d(context, R.attr.colorSwitchThumbNormal);
            if (d10 != null && d10.isStateful()) {
                int[] iArr3 = v3.f674b;
                iArr[0] = iArr3;
                iArr2[0] = d10.getColorForState(iArr3, 0);
                iArr[1] = v3.f677e;
                iArr2[1] = v3.c(context, R.attr.colorControlActivated);
                iArr[2] = v3.f678f;
                iArr2[2] = d10.getDefaultColor();
            } else {
                iArr[0] = v3.f674b;
                iArr2[0] = v3.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = v3.f677e;
                iArr2[1] = v3.c(context, R.attr.colorControlActivated);
                iArr[2] = v3.f678f;
                iArr2[2] = v3.c(context, R.attr.colorSwitchThumbNormal);
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
            return b(context, v3.c(context, R.attr.colorButtonNormal));
        }
        if (i10 == R.drawable.abc_btn_borderless_material) {
            return b(context, 0);
        }
        if (i10 == R.drawable.abc_btn_colored_material) {
            return b(context, v3.c(context, R.attr.colorAccent));
        }
        if (i10 != R.drawable.abc_spinner_mtrl_am_alpha && i10 != R.drawable.abc_spinner_textfield_background_material) {
            if (a((int[]) this.f682c, i10)) {
                return v3.d(context, R.attr.colorControlNormal);
            }
            if (a((int[]) this.f685f, i10)) {
                return x.j.getColorStateList(context, R.color.abc_tint_default);
            }
            if (a((int[]) this.f686g, i10)) {
                return x.j.getColorStateList(context, R.color.abc_tint_btn_checkable);
            }
            if (i10 == R.drawable.abc_seekbar_thumb_material) {
                return x.j.getColorStateList(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        return x.j.getColorStateList(context, R.color.abc_tint_spinner);
    }

    public final String toString() {
        switch (this.f680a) {
            case 3:
                StringBuilder sb = new StringBuilder("Request{method=");
                sb.append((String) this.f682c);
                sb.append(", url=");
                sb.append((y8.q) this.f681b);
                y8.o oVar = (y8.o) this.f683d;
                if (oVar.f11770a.length / 2 != 0) {
                    sb.append(", headers=[");
                    Iterator it = oVar.iterator();
                    int i10 = 0;
                    while (true) {
                        g0.f1 f1Var = (g0.f1) it;
                        if (f1Var.hasNext()) {
                            Object next = f1Var.next();
                            int i11 = i10 + 1;
                            if (i10 >= 0) {
                                w6.b bVar = (w6.b) next;
                                String str = (String) bVar.f11012a;
                                String str2 = (String) bVar.f11013b;
                                if (i10 > 0) {
                                    sb.append(", ");
                                }
                                sb.append(str);
                                sb.append(':');
                                sb.append(str2);
                                i10 = i11;
                            } else {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                        } else {
                            sb.append(']');
                        }
                    }
                }
                if (!((Map) this.f685f).isEmpty()) {
                    sb.append(", tags=");
                    sb.append((Map) this.f685f);
                }
                sb.append('}');
                String sb2 = sb.toString();
                r6.h0.s(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public w() {
        this.f680a = 0;
        this.f681b = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.f682c = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f683d = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.f684e = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.f685f = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f686g = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public w(Context context, a8.b bVar, a8.e eVar, a8.h hVar, List list, String str) {
        this.f680a = 2;
        this.f681b = context.getApplicationContext();
        this.f682c = bVar;
        this.f683d = eVar;
        this.f684e = hVar;
        this.f685f = list;
        this.f686g = str;
    }
}
