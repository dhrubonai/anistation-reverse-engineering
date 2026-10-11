package s;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import msr.pistream.app.download.PiStreamDownloadService;
import org.xmlpull.v1.XmlPullParserException;
import p7.a0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f9709d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f9710e;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9711a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9712b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f9713c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9710e = sparseIntArray;
        sparseIntArray.append(76, 25);
        sparseIntArray.append(77, 26);
        sparseIntArray.append(79, 29);
        sparseIntArray.append(80, 30);
        sparseIntArray.append(86, 36);
        sparseIntArray.append(85, 35);
        sparseIntArray.append(58, 4);
        sparseIntArray.append(57, 3);
        sparseIntArray.append(55, 1);
        sparseIntArray.append(94, 6);
        sparseIntArray.append(95, 7);
        sparseIntArray.append(65, 17);
        sparseIntArray.append(66, 18);
        sparseIntArray.append(67, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(81, 32);
        sparseIntArray.append(82, 33);
        sparseIntArray.append(64, 10);
        sparseIntArray.append(63, 9);
        sparseIntArray.append(98, 13);
        sparseIntArray.append(101, 16);
        sparseIntArray.append(99, 14);
        sparseIntArray.append(96, 11);
        sparseIntArray.append(100, 15);
        sparseIntArray.append(97, 12);
        sparseIntArray.append(89, 40);
        sparseIntArray.append(74, 39);
        sparseIntArray.append(73, 41);
        sparseIntArray.append(88, 42);
        sparseIntArray.append(72, 20);
        sparseIntArray.append(87, 37);
        sparseIntArray.append(62, 5);
        sparseIntArray.append(75, 82);
        sparseIntArray.append(84, 82);
        sparseIntArray.append(78, 82);
        sparseIntArray.append(56, 82);
        sparseIntArray.append(54, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(90, 54);
        sparseIntArray.append(68, 55);
        sparseIntArray.append(91, 56);
        sparseIntArray.append(69, 57);
        sparseIntArray.append(92, 58);
        sparseIntArray.append(70, 59);
        sparseIntArray.append(59, 61);
        sparseIntArray.append(61, 62);
        sparseIntArray.append(60, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(106, 65);
        sparseIntArray.append(33, 66);
        sparseIntArray.append(107, 67);
        sparseIntArray.append(103, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(102, 68);
        sparseIntArray.append(93, 69);
        sparseIntArray.append(71, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(104, 76);
        sparseIntArray.append(83, 77);
        sparseIntArray.append(108, 78);
        sparseIntArray.append(53, 80);
        sparseIntArray.append(52, 81);
    }

    public static int[] c(Barrier barrier, String str) {
        int i10;
        HashMap hashMap;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            Object obj = null;
            try {
                i10 = p.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, PiStreamDownloadService.EXTRA_ID, context.getPackageName());
            }
            if (i10 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.D) != null && hashMap.containsKey(trim)) {
                    obj = constraintLayout.D.get(trim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    i10 = ((Integer) obj).intValue();
                }
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        if (i12 != split.length) {
            return Arrays.copyOf(iArr, i12);
        }
        return iArr;
    }

    public static h d(Context context, AttributeSet attributeSet) {
        h hVar = new h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f9714a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            k kVar = hVar.f9647b;
            j jVar = hVar.f9648c;
            l lVar = hVar.f9650e;
            i iVar = hVar.f9649d;
            if (index != 1 && 23 != index && 24 != index) {
                jVar.getClass();
                iVar.getClass();
                kVar.getClass();
                lVar.getClass();
            }
            SparseIntArray sparseIntArray = f9710e;
            switch (sparseIntArray.get(index)) {
                case 1:
                    iVar.o = f(obtainStyledAttributes, index, iVar.o);
                    break;
                case 2:
                    iVar.F = obtainStyledAttributes.getDimensionPixelSize(index, iVar.F);
                    break;
                case 3:
                    iVar.f9675n = f(obtainStyledAttributes, index, iVar.f9675n);
                    break;
                case 4:
                    iVar.f9674m = f(obtainStyledAttributes, index, iVar.f9674m);
                    break;
                case 5:
                    iVar.f9682v = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    iVar.f9686z = obtainStyledAttributes.getDimensionPixelOffset(index, iVar.f9686z);
                    break;
                case zzaja.zze.zzg /* 7 */:
                    iVar.A = obtainStyledAttributes.getDimensionPixelOffset(index, iVar.A);
                    break;
                case 8:
                    iVar.G = obtainStyledAttributes.getDimensionPixelSize(index, iVar.G);
                    break;
                case 9:
                    iVar.f9679s = f(obtainStyledAttributes, index, iVar.f9679s);
                    break;
                case 10:
                    iVar.f9678r = f(obtainStyledAttributes, index, iVar.f9678r);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    iVar.L = obtainStyledAttributes.getDimensionPixelSize(index, iVar.L);
                    break;
                case 12:
                    iVar.M = obtainStyledAttributes.getDimensionPixelSize(index, iVar.M);
                    break;
                case 13:
                    iVar.I = obtainStyledAttributes.getDimensionPixelSize(index, iVar.I);
                    break;
                case 14:
                    iVar.K = obtainStyledAttributes.getDimensionPixelSize(index, iVar.K);
                    break;
                case 15:
                    iVar.N = obtainStyledAttributes.getDimensionPixelSize(index, iVar.N);
                    break;
                case 16:
                    iVar.J = obtainStyledAttributes.getDimensionPixelSize(index, iVar.J);
                    break;
                case 17:
                    iVar.f9659d = obtainStyledAttributes.getDimensionPixelOffset(index, iVar.f9659d);
                    break;
                case 18:
                    iVar.f9661e = obtainStyledAttributes.getDimensionPixelOffset(index, iVar.f9661e);
                    break;
                case 19:
                    iVar.f9663f = obtainStyledAttributes.getFloat(index, iVar.f9663f);
                    break;
                case 20:
                    iVar.f9680t = obtainStyledAttributes.getFloat(index, iVar.f9680t);
                    break;
                case 21:
                    iVar.f9657c = obtainStyledAttributes.getLayoutDimension(index, iVar.f9657c);
                    break;
                case 22:
                    kVar.f9692a = f9709d[obtainStyledAttributes.getInt(index, kVar.f9692a)];
                    break;
                case 23:
                    iVar.f9655b = obtainStyledAttributes.getLayoutDimension(index, iVar.f9655b);
                    break;
                case 24:
                    iVar.C = obtainStyledAttributes.getDimensionPixelSize(index, iVar.C);
                    break;
                case 25:
                    iVar.f9665g = f(obtainStyledAttributes, index, iVar.f9665g);
                    break;
                case 26:
                    iVar.f9667h = f(obtainStyledAttributes, index, iVar.f9667h);
                    break;
                case 27:
                    iVar.B = obtainStyledAttributes.getInt(index, iVar.B);
                    break;
                case 28:
                    iVar.D = obtainStyledAttributes.getDimensionPixelSize(index, iVar.D);
                    break;
                case 29:
                    iVar.f9669i = f(obtainStyledAttributes, index, iVar.f9669i);
                    break;
                case 30:
                    iVar.f9671j = f(obtainStyledAttributes, index, iVar.f9671j);
                    break;
                case 31:
                    iVar.H = obtainStyledAttributes.getDimensionPixelSize(index, iVar.H);
                    break;
                case 32:
                    iVar.f9676p = f(obtainStyledAttributes, index, iVar.f9676p);
                    break;
                case 33:
                    iVar.f9677q = f(obtainStyledAttributes, index, iVar.f9677q);
                    break;
                case 34:
                    iVar.E = obtainStyledAttributes.getDimensionPixelSize(index, iVar.E);
                    break;
                case 35:
                    iVar.f9673l = f(obtainStyledAttributes, index, iVar.f9673l);
                    break;
                case 36:
                    iVar.f9672k = f(obtainStyledAttributes, index, iVar.f9672k);
                    break;
                case 37:
                    iVar.f9681u = obtainStyledAttributes.getFloat(index, iVar.f9681u);
                    break;
                case 38:
                    hVar.f9646a = obtainStyledAttributes.getResourceId(index, hVar.f9646a);
                    break;
                case 39:
                    iVar.P = obtainStyledAttributes.getFloat(index, iVar.P);
                    break;
                case 40:
                    iVar.O = obtainStyledAttributes.getFloat(index, iVar.O);
                    break;
                case 41:
                    iVar.Q = obtainStyledAttributes.getInt(index, iVar.Q);
                    break;
                case 42:
                    iVar.R = obtainStyledAttributes.getInt(index, iVar.R);
                    break;
                case 43:
                    kVar.f9694c = obtainStyledAttributes.getFloat(index, kVar.f9694c);
                    break;
                case 44:
                    lVar.f9707k = true;
                    lVar.f9708l = obtainStyledAttributes.getDimension(index, lVar.f9708l);
                    break;
                case 45:
                    lVar.f9698b = obtainStyledAttributes.getFloat(index, lVar.f9698b);
                    break;
                case 46:
                    lVar.f9699c = obtainStyledAttributes.getFloat(index, lVar.f9699c);
                    break;
                case 47:
                    lVar.f9700d = obtainStyledAttributes.getFloat(index, lVar.f9700d);
                    break;
                case 48:
                    lVar.f9701e = obtainStyledAttributes.getFloat(index, lVar.f9701e);
                    break;
                case 49:
                    lVar.f9702f = obtainStyledAttributes.getDimension(index, lVar.f9702f);
                    break;
                case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                    lVar.f9703g = obtainStyledAttributes.getDimension(index, lVar.f9703g);
                    break;
                case 51:
                    lVar.f9704h = obtainStyledAttributes.getDimension(index, lVar.f9704h);
                    break;
                case 52:
                    lVar.f9705i = obtainStyledAttributes.getDimension(index, lVar.f9705i);
                    break;
                case 53:
                    lVar.f9706j = obtainStyledAttributes.getDimension(index, lVar.f9706j);
                    break;
                case 54:
                    iVar.S = obtainStyledAttributes.getInt(index, iVar.S);
                    break;
                case 55:
                    iVar.T = obtainStyledAttributes.getInt(index, iVar.T);
                    break;
                case 56:
                    iVar.U = obtainStyledAttributes.getDimensionPixelSize(index, iVar.U);
                    break;
                case 57:
                    iVar.V = obtainStyledAttributes.getDimensionPixelSize(index, iVar.V);
                    break;
                case 58:
                    iVar.W = obtainStyledAttributes.getDimensionPixelSize(index, iVar.W);
                    break;
                case 59:
                    iVar.X = obtainStyledAttributes.getDimensionPixelSize(index, iVar.X);
                    break;
                case 60:
                    lVar.f9697a = obtainStyledAttributes.getFloat(index, lVar.f9697a);
                    break;
                case 61:
                    iVar.f9683w = f(obtainStyledAttributes, index, iVar.f9683w);
                    break;
                case 62:
                    iVar.f9684x = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f9684x);
                    break;
                case 63:
                    iVar.f9685y = obtainStyledAttributes.getFloat(index, iVar.f9685y);
                    break;
                case 64:
                    jVar.f9688a = f(obtainStyledAttributes, index, jVar.f9688a);
                    break;
                case 65:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        jVar.getClass();
                        break;
                    } else {
                        String str = a0.B[obtainStyledAttributes.getInteger(index, 0)];
                        jVar.getClass();
                        break;
                    }
                case 66:
                    obtainStyledAttributes.getInt(index, 0);
                    jVar.getClass();
                    break;
                case 67:
                    jVar.f9691d = obtainStyledAttributes.getFloat(index, jVar.f9691d);
                    break;
                case 68:
                    kVar.f9695d = obtainStyledAttributes.getFloat(index, kVar.f9695d);
                    break;
                case 69:
                    iVar.Y = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    iVar.Z = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    iVar.f9654a0 = obtainStyledAttributes.getInt(index, iVar.f9654a0);
                    break;
                case 73:
                    iVar.f9656b0 = obtainStyledAttributes.getDimensionPixelSize(index, iVar.f9656b0);
                    break;
                case 74:
                    iVar.f9662e0 = obtainStyledAttributes.getString(index);
                    break;
                case 75:
                    iVar.f9670i0 = obtainStyledAttributes.getBoolean(index, iVar.f9670i0);
                    break;
                case 76:
                    jVar.f9689b = obtainStyledAttributes.getInt(index, jVar.f9689b);
                    break;
                case 77:
                    iVar.f9664f0 = obtainStyledAttributes.getString(index);
                    break;
                case 78:
                    kVar.f9693b = obtainStyledAttributes.getInt(index, kVar.f9693b);
                    break;
                case 79:
                    jVar.f9690c = obtainStyledAttributes.getFloat(index, jVar.f9690c);
                    break;
                case 80:
                    iVar.f9666g0 = obtainStyledAttributes.getBoolean(index, iVar.f9666g0);
                    break;
                case 81:
                    iVar.f9668h0 = obtainStyledAttributes.getBoolean(index, iVar.f9668h0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
            }
        }
        obtainStyledAttributes.recycle();
        return hVar;
    }

    public static int f(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        if (resourceId == -1) {
            return typedArray.getInt(i10, -1);
        }
        return resourceId;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:43:0x0103. Please report as an issue. */
    public final void a(ConstraintLayout constraintLayout) {
        int i10;
        Iterator it;
        String str;
        m mVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = mVar.f9713c;
        HashSet hashSet = new HashSet(hashMap.keySet());
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = constraintLayout.getChildAt(i11);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                sb.append(str);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (mVar.f9712b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        h hVar = (h) hashMap.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            hVar.f9649d.f9658c0 = 1;
                        }
                        int i12 = hVar.f9649d.f9658c0;
                        if (i12 != -1 && i12 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            i iVar = hVar.f9649d;
                            barrier.setType(iVar.f9654a0);
                            barrier.setMargin(iVar.f9656b0);
                            barrier.setAllowsGoneWidget(iVar.f9670i0);
                            int[] iArr = iVar.f9660d0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str2 = iVar.f9662e0;
                                if (str2 != null) {
                                    int[] c6 = c(barrier, str2);
                                    iVar.f9660d0 = c6;
                                    barrier.setReferencedIds(c6);
                                }
                            }
                        }
                        d dVar = (d) childAt.getLayoutParams();
                        dVar.a();
                        hVar.a(dVar);
                        HashMap hashMap2 = hVar.f9651f;
                        Class<?> cls = childAt.getClass();
                        Iterator it2 = hashMap2.keySet().iterator();
                        while (it2.hasNext()) {
                            String str3 = (String) it2.next();
                            a aVar = (a) hashMap2.get(str3);
                            int i13 = childCount;
                            String d10 = r.f.d("set", str3);
                            HashMap hashMap3 = hashMap2;
                            try {
                                switch (p.j.b(aVar.f9583a)) {
                                    case 0:
                                        it = it2;
                                        cls.getMethod(d10, Integer.TYPE).invoke(childAt, Integer.valueOf(aVar.f9584b));
                                        break;
                                    case 1:
                                        it = it2;
                                        cls.getMethod(d10, Float.TYPE).invoke(childAt, Float.valueOf(aVar.f9585c));
                                        break;
                                    case 2:
                                        it = it2;
                                        cls.getMethod(d10, Integer.TYPE).invoke(childAt, Integer.valueOf(aVar.f9588f));
                                        break;
                                    case 3:
                                        it = it2;
                                        Method method = cls.getMethod(d10, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(aVar.f9588f);
                                        method.invoke(childAt, colorDrawable);
                                        break;
                                    case 4:
                                        it = it2;
                                        cls.getMethod(d10, CharSequence.class).invoke(childAt, aVar.f9586d);
                                        break;
                                    case 5:
                                        it = it2;
                                        cls.getMethod(d10, Boolean.TYPE).invoke(childAt, Boolean.valueOf(aVar.f9587e));
                                        break;
                                    case 6:
                                        it = it2;
                                        try {
                                            cls.getMethod(d10, Float.TYPE).invoke(childAt, Float.valueOf(aVar.f9585c));
                                        } catch (IllegalAccessException e10) {
                                            e = e10;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                            e.printStackTrace();
                                            childCount = i13;
                                            hashMap2 = hashMap3;
                                            it2 = it;
                                        } catch (NoSuchMethodException e11) {
                                            e = e11;
                                            Log.e("TransitionLayout", e.getMessage());
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + d10);
                                            childCount = i13;
                                            hashMap2 = hashMap3;
                                            it2 = it;
                                        } catch (InvocationTargetException e12) {
                                            e = e12;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                            e.printStackTrace();
                                            childCount = i13;
                                            hashMap2 = hashMap3;
                                            it2 = it;
                                        }
                                    default:
                                        it = it2;
                                        break;
                                }
                            } catch (IllegalAccessException e13) {
                                e = e13;
                                it = it2;
                            } catch (NoSuchMethodException e14) {
                                e = e14;
                                it = it2;
                            } catch (InvocationTargetException e15) {
                                e = e15;
                                it = it2;
                            }
                            childCount = i13;
                            hashMap2 = hashMap3;
                            it2 = it;
                        }
                        i10 = childCount;
                        childAt.setLayoutParams(dVar);
                        k kVar = hVar.f9647b;
                        if (kVar.f9693b == 0) {
                            childAt.setVisibility(kVar.f9692a);
                        }
                        childAt.setAlpha(kVar.f9694c);
                        l lVar = hVar.f9650e;
                        childAt.setRotation(lVar.f9697a);
                        childAt.setRotationX(lVar.f9698b);
                        childAt.setRotationY(lVar.f9699c);
                        childAt.setScaleX(lVar.f9700d);
                        childAt.setScaleY(lVar.f9701e);
                        if (!Float.isNaN(lVar.f9702f)) {
                            childAt.setPivotX(lVar.f9702f);
                        }
                        if (!Float.isNaN(lVar.f9703g)) {
                            childAt.setPivotY(lVar.f9703g);
                        }
                        childAt.setTranslationX(lVar.f9704h);
                        childAt.setTranslationY(lVar.f9705i);
                        childAt.setTranslationZ(lVar.f9706j);
                        if (lVar.f9707k) {
                            childAt.setElevation(lVar.f9708l);
                        }
                    } else {
                        i10 = childCount;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i11++;
                    mVar = this;
                    childCount = i10;
                }
            }
            i10 = childCount;
            i11++;
            mVar = this;
            childCount = i10;
        }
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            Integer num = (Integer) it3.next();
            h hVar2 = (h) hashMap.get(num);
            i iVar2 = hVar2.f9649d;
            int i14 = iVar2.f9658c0;
            if (i14 != -1 && i14 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                int[] iArr2 = iVar2.f9660d0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str4 = iVar2.f9662e0;
                    if (str4 != null) {
                        int[] c10 = c(barrier2, str4);
                        iVar2.f9660d0 = c10;
                        barrier2.setReferencedIds(c10);
                    }
                }
                barrier2.setType(iVar2.f9654a0);
                barrier2.setMargin(iVar2.f9656b0);
                int i15 = ConstraintLayout.G;
                d dVar2 = new d();
                barrier2.g();
                hVar2.a(dVar2);
                constraintLayout.addView(barrier2, dVar2);
            }
            if (iVar2.f9653a) {
                View oVar = new o(constraintLayout.getContext());
                oVar.setId(num.intValue());
                int i16 = ConstraintLayout.G;
                d dVar3 = new d();
                hVar2.a(dVar3);
                constraintLayout.addView(oVar, dVar3);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i10;
        m mVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = mVar.f9713c;
        hashMap.clear();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = constraintLayout.getChildAt(i11);
            d dVar = (d) childAt.getLayoutParams();
            int id = childAt.getId();
            if (mVar.f9712b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new h());
            }
            h hVar = (h) hashMap.get(Integer.valueOf(id));
            HashMap hashMap2 = mVar.f9711a;
            HashMap hashMap3 = new HashMap();
            Class<?> cls = childAt.getClass();
            for (String str : hashMap2.keySet()) {
                a aVar = (a) hashMap2.get(str);
                try {
                } catch (IllegalAccessException e10) {
                    e = e10;
                    i10 = childCount;
                } catch (NoSuchMethodException e11) {
                    e = e11;
                    i10 = childCount;
                } catch (InvocationTargetException e12) {
                    e = e12;
                    i10 = childCount;
                }
                if (str.equals("BackgroundColor")) {
                    hashMap3.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                } else {
                    i10 = childCount;
                    try {
                        hashMap3.put(str, new a(aVar, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                    } catch (IllegalAccessException e13) {
                        e = e13;
                        e.printStackTrace();
                        childCount = i10;
                    } catch (NoSuchMethodException e14) {
                        e = e14;
                        e.printStackTrace();
                        childCount = i10;
                    } catch (InvocationTargetException e15) {
                        e = e15;
                        e.printStackTrace();
                        childCount = i10;
                    }
                    childCount = i10;
                }
            }
            int i12 = childCount;
            hVar.f9651f = hashMap3;
            hVar.f9646a = id;
            int i13 = dVar.f9602d;
            i iVar = hVar.f9649d;
            iVar.f9665g = i13;
            iVar.f9667h = dVar.f9604e;
            iVar.f9669i = dVar.f9606f;
            iVar.f9671j = dVar.f9608g;
            iVar.f9672k = dVar.f9610h;
            iVar.f9673l = dVar.f9612i;
            iVar.f9674m = dVar.f9614j;
            iVar.f9675n = dVar.f9616k;
            iVar.o = dVar.f9618l;
            iVar.f9676p = dVar.f9621p;
            iVar.f9677q = dVar.f9622q;
            iVar.f9678r = dVar.f9623r;
            iVar.f9679s = dVar.f9624s;
            iVar.f9680t = dVar.f9631z;
            iVar.f9681u = dVar.A;
            iVar.f9682v = dVar.B;
            iVar.f9683w = dVar.f9619m;
            iVar.f9684x = dVar.f9620n;
            iVar.f9685y = dVar.o;
            iVar.f9686z = dVar.P;
            iVar.A = dVar.Q;
            iVar.B = dVar.R;
            iVar.f9663f = dVar.f9600c;
            iVar.f9659d = dVar.f9596a;
            iVar.f9661e = dVar.f9598b;
            iVar.f9655b = ((ViewGroup.MarginLayoutParams) dVar).width;
            iVar.f9657c = ((ViewGroup.MarginLayoutParams) dVar).height;
            iVar.C = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
            iVar.D = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
            iVar.E = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
            iVar.F = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
            iVar.O = dVar.E;
            iVar.P = dVar.D;
            iVar.R = dVar.G;
            iVar.Q = dVar.F;
            iVar.f9666g0 = dVar.S;
            iVar.f9668h0 = dVar.T;
            iVar.S = dVar.H;
            iVar.T = dVar.I;
            iVar.U = dVar.L;
            iVar.V = dVar.M;
            iVar.W = dVar.J;
            iVar.X = dVar.K;
            iVar.Y = dVar.N;
            iVar.Z = dVar.O;
            iVar.f9664f0 = dVar.U;
            iVar.J = dVar.f9626u;
            iVar.L = dVar.f9628w;
            iVar.I = dVar.f9625t;
            iVar.K = dVar.f9627v;
            iVar.N = dVar.f9629x;
            iVar.M = dVar.f9630y;
            iVar.G = dVar.getMarginEnd();
            iVar.H = dVar.getMarginStart();
            int visibility = childAt.getVisibility();
            k kVar = hVar.f9647b;
            kVar.f9692a = visibility;
            kVar.f9694c = childAt.getAlpha();
            float rotation = childAt.getRotation();
            l lVar = hVar.f9650e;
            lVar.f9697a = rotation;
            lVar.f9698b = childAt.getRotationX();
            lVar.f9699c = childAt.getRotationY();
            lVar.f9700d = childAt.getScaleX();
            lVar.f9701e = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                lVar.f9702f = pivotX;
                lVar.f9703g = pivotY;
            }
            lVar.f9704h = childAt.getTranslationX();
            lVar.f9705i = childAt.getTranslationY();
            lVar.f9706j = childAt.getTranslationZ();
            if (lVar.f9707k) {
                lVar.f9708l = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                iVar.f9670i0 = barrier.f763z.f8785g0;
                iVar.f9660d0 = barrier.getReferencedIds();
                iVar.f9654a0 = barrier.getType();
                iVar.f9656b0 = barrier.getMargin();
            }
            i11++;
            mVar = this;
            childCount = i12;
        }
    }

    public final void e(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        h d10 = d(context, Xml.asAttributeSet(xml));
                        if (name.equalsIgnoreCase("Guideline")) {
                            d10.f9649d.f9653a = true;
                        }
                        this.f9713c.put(Integer.valueOf(d10.f9646a), d10);
                    }
                } else {
                    xml.getName();
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }
}
