package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class au2 extends wc7 {
    public static final Pattern k = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder i = StandardCharsets.UTF_8.newDecoder();
    public final CharsetDecoder j = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // defpackage.wc7
    public final fy3 n(hy3 hy3Var, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.j;
        CharsetDecoder charsetDecoder2 = this.i;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new fy3(new cu2(null, null, bArr));
        }
        Matcher matcher = k.matcher(str);
        String str3 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String U = wc7.U(group);
                U.getClass();
                if (!U.equals("streamurl")) {
                    if (U.equals("streamtitle")) {
                        str2 = group2;
                    }
                } else {
                    str3 = group2;
                }
            }
        }
        return new fy3(new cu2(str2, str3, bArr));
    }
}
