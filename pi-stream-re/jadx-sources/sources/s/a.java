package s;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f9583a;

    /* renamed from: b, reason: collision with root package name */
    public int f9584b;

    /* renamed from: c, reason: collision with root package name */
    public float f9585c;

    /* renamed from: d, reason: collision with root package name */
    public String f9586d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9587e;

    /* renamed from: f, reason: collision with root package name */
    public int f9588f;

    public a(String str, int i10, Object obj) {
        this.f9583a = i10;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f9716c);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i10 = 0;
        Object obj = null;
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i10 = 6;
            } else {
                int i12 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i12 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i12 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i10 = 2;
                            } else if (index == 6) {
                                obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                i10 = 1;
                            } else if (index == 8) {
                                obj = obtainStyledAttributes.getString(index);
                            }
                        }
                        i10 = 7;
                    }
                }
                i10 = i12;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new a(str, i10, obj));
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (p.j.b(this.f9583a)) {
            case 0:
                this.f9584b = ((Integer) obj).intValue();
                return;
            case 1:
                this.f9585c = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f9588f = ((Integer) obj).intValue();
                return;
            case 4:
                this.f9586d = (String) obj;
                return;
            case 5:
                this.f9587e = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.f9585c = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public a(a aVar, Object obj) {
        aVar.getClass();
        this.f9583a = aVar.f9583a;
        b(obj);
    }
}
