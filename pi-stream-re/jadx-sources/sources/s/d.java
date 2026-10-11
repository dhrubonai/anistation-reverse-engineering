package s;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {
    public float A;
    public String B;
    public final int C;
    public float D;
    public float E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public float N;
    public float O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public String U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public int f9596a;

    /* renamed from: a0, reason: collision with root package name */
    public int f9597a0;

    /* renamed from: b, reason: collision with root package name */
    public int f9598b;

    /* renamed from: b0, reason: collision with root package name */
    public int f9599b0;

    /* renamed from: c, reason: collision with root package name */
    public float f9600c;

    /* renamed from: c0, reason: collision with root package name */
    public int f9601c0;

    /* renamed from: d, reason: collision with root package name */
    public int f9602d;

    /* renamed from: d0, reason: collision with root package name */
    public int f9603d0;

    /* renamed from: e, reason: collision with root package name */
    public int f9604e;

    /* renamed from: e0, reason: collision with root package name */
    public int f9605e0;

    /* renamed from: f, reason: collision with root package name */
    public int f9606f;

    /* renamed from: f0, reason: collision with root package name */
    public int f9607f0;

    /* renamed from: g, reason: collision with root package name */
    public int f9608g;

    /* renamed from: g0, reason: collision with root package name */
    public float f9609g0;

    /* renamed from: h, reason: collision with root package name */
    public int f9610h;

    /* renamed from: h0, reason: collision with root package name */
    public int f9611h0;

    /* renamed from: i, reason: collision with root package name */
    public int f9612i;

    /* renamed from: i0, reason: collision with root package name */
    public int f9613i0;

    /* renamed from: j, reason: collision with root package name */
    public int f9614j;

    /* renamed from: j0, reason: collision with root package name */
    public float f9615j0;

    /* renamed from: k, reason: collision with root package name */
    public int f9616k;

    /* renamed from: k0, reason: collision with root package name */
    public q.e f9617k0;

    /* renamed from: l, reason: collision with root package name */
    public int f9618l;

    /* renamed from: m, reason: collision with root package name */
    public int f9619m;

    /* renamed from: n, reason: collision with root package name */
    public int f9620n;
    public float o;

    /* renamed from: p, reason: collision with root package name */
    public int f9621p;

    /* renamed from: q, reason: collision with root package name */
    public int f9622q;

    /* renamed from: r, reason: collision with root package name */
    public int f9623r;

    /* renamed from: s, reason: collision with root package name */
    public int f9624s;

    /* renamed from: t, reason: collision with root package name */
    public final int f9625t;

    /* renamed from: u, reason: collision with root package name */
    public int f9626u;

    /* renamed from: v, reason: collision with root package name */
    public final int f9627v;

    /* renamed from: w, reason: collision with root package name */
    public int f9628w;

    /* renamed from: x, reason: collision with root package name */
    public int f9629x;

    /* renamed from: y, reason: collision with root package name */
    public int f9630y;

    /* renamed from: z, reason: collision with root package name */
    public float f9631z;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        this.f9596a = -1;
        this.f9598b = -1;
        this.f9600c = -1.0f;
        this.f9602d = -1;
        this.f9604e = -1;
        this.f9606f = -1;
        this.f9608g = -1;
        this.f9610h = -1;
        this.f9612i = -1;
        this.f9614j = -1;
        this.f9616k = -1;
        this.f9618l = -1;
        this.f9619m = -1;
        this.f9620n = 0;
        this.o = 0.0f;
        this.f9621p = -1;
        this.f9622q = -1;
        this.f9623r = -1;
        this.f9624s = -1;
        this.f9625t = -1;
        this.f9626u = -1;
        this.f9627v = -1;
        this.f9628w = -1;
        this.f9629x = -1;
        this.f9630y = -1;
        this.f9631z = 0.5f;
        this.A = 0.5f;
        this.B = null;
        this.C = 1;
        this.D = -1.0f;
        this.E = -1.0f;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 1.0f;
        this.O = 1.0f;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = false;
        this.T = false;
        this.U = null;
        this.V = true;
        this.W = true;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f9597a0 = -1;
        this.f9599b0 = -1;
        this.f9601c0 = -1;
        this.f9603d0 = -1;
        this.f9605e0 = -1;
        this.f9607f0 = -1;
        this.f9609g0 = 0.5f;
        this.f9617k0 = new q.e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f9715b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            int i12 = c.f9595a.get(index);
            switch (i12) {
                case 1:
                    this.R = obtainStyledAttributes.getInt(index, this.R);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f9619m);
                    this.f9619m = resourceId;
                    if (resourceId == -1) {
                        this.f9619m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    this.f9620n = obtainStyledAttributes.getDimensionPixelSize(index, this.f9620n);
                    break;
                case 4:
                    float f10 = obtainStyledAttributes.getFloat(index, this.o) % 360.0f;
                    this.o = f10;
                    if (f10 < 0.0f) {
                        this.o = (360.0f - f10) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    this.f9596a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9596a);
                    break;
                case 6:
                    this.f9598b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9598b);
                    break;
                case zzaja.zze.zzg /* 7 */:
                    this.f9600c = obtainStyledAttributes.getFloat(index, this.f9600c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f9602d);
                    this.f9602d = resourceId2;
                    if (resourceId2 == -1) {
                        this.f9602d = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f9604e);
                    this.f9604e = resourceId3;
                    if (resourceId3 == -1) {
                        this.f9604e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f9606f);
                    this.f9606f = resourceId4;
                    if (resourceId4 == -1) {
                        this.f9606f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f9608g);
                    this.f9608g = resourceId5;
                    if (resourceId5 == -1) {
                        this.f9608g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f9610h);
                    this.f9610h = resourceId6;
                    if (resourceId6 == -1) {
                        this.f9610h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f9612i);
                    this.f9612i = resourceId7;
                    if (resourceId7 == -1) {
                        this.f9612i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f9614j);
                    this.f9614j = resourceId8;
                    if (resourceId8 == -1) {
                        this.f9614j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f9616k);
                    this.f9616k = resourceId9;
                    if (resourceId9 == -1) {
                        this.f9616k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f9618l);
                    this.f9618l = resourceId10;
                    if (resourceId10 == -1) {
                        this.f9618l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f9621p);
                    this.f9621p = resourceId11;
                    if (resourceId11 == -1) {
                        this.f9621p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f9622q);
                    this.f9622q = resourceId12;
                    if (resourceId12 == -1) {
                        this.f9622q = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f9623r);
                    this.f9623r = resourceId13;
                    if (resourceId13 == -1) {
                        this.f9623r = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f9624s);
                    this.f9624s = resourceId14;
                    if (resourceId14 == -1) {
                        this.f9624s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    this.f9625t = obtainStyledAttributes.getDimensionPixelSize(index, this.f9625t);
                    break;
                case 22:
                    this.f9626u = obtainStyledAttributes.getDimensionPixelSize(index, this.f9626u);
                    break;
                case 23:
                    this.f9627v = obtainStyledAttributes.getDimensionPixelSize(index, this.f9627v);
                    break;
                case 24:
                    this.f9628w = obtainStyledAttributes.getDimensionPixelSize(index, this.f9628w);
                    break;
                case 25:
                    this.f9629x = obtainStyledAttributes.getDimensionPixelSize(index, this.f9629x);
                    break;
                case 26:
                    this.f9630y = obtainStyledAttributes.getDimensionPixelSize(index, this.f9630y);
                    break;
                case 27:
                    this.S = obtainStyledAttributes.getBoolean(index, this.S);
                    break;
                case 28:
                    this.T = obtainStyledAttributes.getBoolean(index, this.T);
                    break;
                case 29:
                    this.f9631z = obtainStyledAttributes.getFloat(index, this.f9631z);
                    break;
                case 30:
                    this.A = obtainStyledAttributes.getFloat(index, this.A);
                    break;
                case 31:
                    int i13 = obtainStyledAttributes.getInt(index, 0);
                    this.H = i13;
                    if (i13 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i14 = obtainStyledAttributes.getInt(index, 0);
                    this.I = i14;
                    if (i14 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, this.J) == -2) {
                            this.J = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, this.L) == -2) {
                            this.L = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    this.N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.N));
                    this.H = 2;
                    break;
                case 36:
                    try {
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, this.K) == -2) {
                            this.K = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, this.M) == -2) {
                            this.M = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    this.O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.O));
                    this.I = 2;
                    break;
                default:
                    switch (i12) {
                        case 44:
                            String string = obtainStyledAttributes.getString(index);
                            this.B = string;
                            this.C = -1;
                            if (string != null) {
                                int length = string.length();
                                int indexOf = this.B.indexOf(44);
                                if (indexOf <= 0 || indexOf >= length - 1) {
                                    i10 = 0;
                                } else {
                                    String substring = this.B.substring(0, indexOf);
                                    if (substring.equalsIgnoreCase("W")) {
                                        this.C = 0;
                                    } else if (substring.equalsIgnoreCase("H")) {
                                        this.C = 1;
                                    }
                                    i10 = indexOf + 1;
                                }
                                int indexOf2 = this.B.indexOf(58);
                                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                    String substring2 = this.B.substring(i10, indexOf2);
                                    String substring3 = this.B.substring(indexOf2 + 1);
                                    if (substring2.length() > 0 && substring3.length() > 0) {
                                        try {
                                            float parseFloat = Float.parseFloat(substring2);
                                            float parseFloat2 = Float.parseFloat(substring3);
                                            if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                if (this.C == 1) {
                                                    Math.abs(parseFloat2 / parseFloat);
                                                    break;
                                                } else {
                                                    Math.abs(parseFloat / parseFloat2);
                                                    break;
                                                }
                                            }
                                        } catch (NumberFormatException unused5) {
                                            break;
                                        }
                                    }
                                } else {
                                    String substring4 = this.B.substring(i10);
                                    if (substring4.length() > 0) {
                                        Float.parseFloat(substring4);
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                            break;
                        case 45:
                            this.D = obtainStyledAttributes.getFloat(index, this.D);
                            break;
                        case 46:
                            this.E = obtainStyledAttributes.getFloat(index, this.E);
                            break;
                        case 47:
                            this.F = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            this.G = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            this.P = obtainStyledAttributes.getDimensionPixelOffset(index, this.P);
                            break;
                        case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                            this.Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                            break;
                        case 51:
                            this.U = obtainStyledAttributes.getString(index);
                            break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
        a();
    }

    public final void a() {
        this.Y = false;
        this.V = true;
        this.W = true;
        int i10 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i10 == -2 && this.S) {
            this.V = false;
            if (this.H == 0) {
                this.H = 1;
            }
        }
        int i11 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i11 == -2 && this.T) {
            this.W = false;
            if (this.I == 0) {
                this.I = 1;
            }
        }
        if (i10 == 0 || i10 == -1) {
            this.V = false;
            if (i10 == 0 && this.H == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.S = true;
            }
        }
        if (i11 == 0 || i11 == -1) {
            this.W = false;
            if (i11 == 0 && this.I == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.T = true;
            }
        }
        if (this.f9600c != -1.0f || this.f9596a != -1 || this.f9598b != -1) {
            this.Y = true;
            this.V = true;
            this.W = true;
            if (!(this.f9617k0 instanceof q.i)) {
                this.f9617k0 = new q.i();
            }
            ((q.i) this.f9617k0).C(this.R);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void resolveLayoutDirection(int r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s.d.resolveLayoutDirection(int):void");
    }

    public d() {
        super(-2, -2);
        this.f9596a = -1;
        this.f9598b = -1;
        this.f9600c = -1.0f;
        this.f9602d = -1;
        this.f9604e = -1;
        this.f9606f = -1;
        this.f9608g = -1;
        this.f9610h = -1;
        this.f9612i = -1;
        this.f9614j = -1;
        this.f9616k = -1;
        this.f9618l = -1;
        this.f9619m = -1;
        this.f9620n = 0;
        this.o = 0.0f;
        this.f9621p = -1;
        this.f9622q = -1;
        this.f9623r = -1;
        this.f9624s = -1;
        this.f9625t = -1;
        this.f9626u = -1;
        this.f9627v = -1;
        this.f9628w = -1;
        this.f9629x = -1;
        this.f9630y = -1;
        this.f9631z = 0.5f;
        this.A = 0.5f;
        this.B = null;
        this.C = 1;
        this.D = -1.0f;
        this.E = -1.0f;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 1.0f;
        this.O = 1.0f;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = false;
        this.T = false;
        this.U = null;
        this.V = true;
        this.W = true;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f9597a0 = -1;
        this.f9599b0 = -1;
        this.f9601c0 = -1;
        this.f9603d0 = -1;
        this.f9605e0 = -1;
        this.f9607f0 = -1;
        this.f9609g0 = 0.5f;
        this.f9617k0 = new q.e();
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f9596a = -1;
        this.f9598b = -1;
        this.f9600c = -1.0f;
        this.f9602d = -1;
        this.f9604e = -1;
        this.f9606f = -1;
        this.f9608g = -1;
        this.f9610h = -1;
        this.f9612i = -1;
        this.f9614j = -1;
        this.f9616k = -1;
        this.f9618l = -1;
        this.f9619m = -1;
        this.f9620n = 0;
        this.o = 0.0f;
        this.f9621p = -1;
        this.f9622q = -1;
        this.f9623r = -1;
        this.f9624s = -1;
        this.f9625t = -1;
        this.f9626u = -1;
        this.f9627v = -1;
        this.f9628w = -1;
        this.f9629x = -1;
        this.f9630y = -1;
        this.f9631z = 0.5f;
        this.A = 0.5f;
        this.B = null;
        this.C = 1;
        this.D = -1.0f;
        this.E = -1.0f;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 1.0f;
        this.O = 1.0f;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = false;
        this.T = false;
        this.U = null;
        this.V = true;
        this.W = true;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f9597a0 = -1;
        this.f9599b0 = -1;
        this.f9601c0 = -1;
        this.f9603d0 = -1;
        this.f9605e0 = -1;
        this.f9607f0 = -1;
        this.f9609g0 = 0.5f;
        this.f9617k0 = new q.e();
    }
}
