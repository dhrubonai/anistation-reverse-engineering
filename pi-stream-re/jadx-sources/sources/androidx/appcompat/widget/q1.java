package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f609l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f610m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f611a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f612b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f613c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f614d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f615e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f616f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f617g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f618h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f619i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f620j;

    /* renamed from: k, reason: collision with root package name */
    public final m1 f621k;

    static {
        new ConcurrentHashMap();
    }

    public q1(TextView textView) {
        this.f619i = textView;
        this.f620j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f621k = new o1();
        } else {
            this.f621k = new m1();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f610m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public static Object e(Object obj, Object obj2, String str) {
        try {
            return d(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    public final void a() {
        boolean z9;
        int measuredWidth;
        if (i() && this.f611a != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return;
        }
        if (this.f612b) {
            if (this.f619i.getMeasuredHeight() > 0 && this.f619i.getMeasuredWidth() > 0) {
                if (this.f621k.b(this.f619i)) {
                    measuredWidth = 1048576;
                } else {
                    measuredWidth = (this.f619i.getMeasuredWidth() - this.f619i.getTotalPaddingLeft()) - this.f619i.getTotalPaddingRight();
                }
                int height = (this.f619i.getHeight() - this.f619i.getCompoundPaddingBottom()) - this.f619i.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    RectF rectF = f609l;
                    synchronized (rectF) {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c6 = c(rectF);
                        if (c6 != this.f619i.getTextSize()) {
                            f(0, c6);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f612b = true;
    }

    public final int c(RectF rectF) {
        boolean z9;
        CharSequence transformation;
        int length = this.f616f.length;
        if (length != 0) {
            int i10 = length - 1;
            int i11 = 1;
            int i12 = 0;
            while (i11 <= i10) {
                int i13 = (i11 + i10) / 2;
                int i14 = this.f616f[i13];
                TextView textView = this.f619i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                    text = transformation;
                }
                int b10 = j1.b(textView);
                TextPaint textPaint = this.f618h;
                if (textPaint == null) {
                    this.f618h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f618h.set(textView.getPaint());
                this.f618h.setTextSize(i14);
                StaticLayout a10 = l1.a(text, (Layout.Alignment) e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), b10, this.f619i, this.f618h, this.f621k);
                if ((b10 != -1 && (a10.getLineCount() > b10 || a10.getLineEnd(a10.getLineCount() - 1) != text.length())) || a10.getHeight() > rectF.bottom) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z9) {
                    int i15 = i13 + 1;
                    i12 = i11;
                    i11 = i15;
                } else {
                    i12 = i13 - 1;
                    i10 = i12;
                }
            }
            return this.f616f[i12];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final void f(int i10, float f10) {
        Resources resources;
        Context context = this.f620j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i10, f10, resources.getDisplayMetrics());
        TextView textView = this.f619i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean a10 = k1.a(textView);
            if (textView.getLayout() != null) {
                this.f612b = false;
                try {
                    Method d10 = d("nullLayouts");
                    if (d10 != null) {
                        d10.invoke(textView, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (!a10) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean g() {
        if (i() && this.f611a == 1) {
            if (!this.f617g || this.f616f.length == 0) {
                int floor = ((int) Math.floor((this.f615e - this.f614d) / this.f613c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f613c) + this.f614d);
                }
                this.f616f = b(iArr);
            }
            this.f612b = true;
        } else {
            this.f612b = false;
        }
        return this.f612b;
    }

    public final boolean h() {
        boolean z9;
        if (this.f616f.length > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f617g = z9;
        if (z9) {
            this.f611a = 1;
            this.f614d = r0[0];
            this.f615e = r0[r1 - 1];
            this.f613c = -1.0f;
        }
        return z9;
    }

    public final boolean i() {
        return !(this.f619i instanceof z);
    }

    public final void j(float f10, float f11, float f12) {
        if (f10 > 0.0f) {
            if (f11 > f10) {
                if (f12 > 0.0f) {
                    this.f611a = 1;
                    this.f614d = f10;
                    this.f615e = f11;
                    this.f613c = f12;
                    this.f617g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
    }
}
