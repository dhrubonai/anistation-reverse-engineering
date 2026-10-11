package z;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import f.p0;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class n extends p0 {
    public n() {
        super(9, 0);
    }

    public static Font J(FontFamily fontFamily, int i10) {
        int i11;
        int i12;
        if ((i10 & 1) != 0) {
            i11 = 700;
        } else {
            i11 = 400;
        }
        if ((i10 & 2) != 0) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        FontStyle fontStyle = new FontStyle(i11, i12);
        Font font = fontFamily.getFont(0);
        int K = K(fontStyle, font.getStyle());
        for (int i13 = 1; i13 < fontFamily.getSize(); i13++) {
            Font font2 = fontFamily.getFont(i13);
            int K2 = K(fontStyle, font2.getStyle());
            if (K2 < K) {
                font = font2;
                K = K2;
            }
        }
        return font;
    }

    public static int K(FontStyle fontStyle, FontStyle fontStyle2) {
        int i10;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        return abs + i10;
    }

    @Override // f.p0
    public final Typeface A(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // f.p0
    public final Typeface B(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font build = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // f.p0
    public final d0.i D(int i10, d0.i[] iVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // f.p0
    public final Typeface y(Context context, y.f fVar, Resources resources, int i10) {
        int i11;
        try {
            FontFamily.Builder builder = null;
            for (y.g gVar : fVar.f11426a) {
                try {
                    Font.Builder weight = new Font.Builder(resources, gVar.f11432f).setWeight(gVar.f11428b);
                    if (gVar.f11429c) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    Font build = weight.setSlant(i11).setTtcIndex(gVar.f11431e).setFontVariationSettings(gVar.f11430d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(J(build2, i10).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // f.p0
    public final Typeface z(Context context, d0.i[] iVarArr, int i10) {
        ParcelFileDescriptor openFileDescriptor;
        int i11;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (d0.i iVar : iVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(iVar.f3028a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor == null) {
                    }
                } else {
                    try {
                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(iVar.f3030c);
                        if (iVar.f3031d) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        Font build = weight.setSlant(i11).setTtcIndex(iVar.f3029b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(J(build2, i10).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }
}
