package com.anistation.model.download;

import defpackage.b06;
import defpackage.c15;
import defpackage.c32;
import defpackage.c94;
import defpackage.d32;
import defpackage.ni5;
import defpackage.os;
import defpackage.st1;
import defpackage.uz5;
import defpackage.y45;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class OfflineDownloadMetadataKt {
    private static final c15 LANGUAGE_TAG_PATTERN = new c15("^[A-Za-z]{2,3}(?:-[A-Za-z0-9]{2,8})*$");

    public static final String getAudioTrackKey(OfflineDownloadMetadata offlineDownloadMetadata) {
        offlineDownloadMetadata.getClass();
        return resolveAudioTrackKey(offlineDownloadMetadata.getAudioLanguage(), offlineDownloadMetadata.getAudioLabel(), offlineDownloadMetadata.getSourceType());
    }

    public static final String getAudioTrackLabel(OfflineDownloadMetadata offlineDownloadMetadata) {
        String obj;
        offlineDownloadMetadata.getClass();
        String audioLabel = offlineDownloadMetadata.getAudioLabel();
        if (audioLabel != null && (obj = uz5.w0(audioLabel).toString()) != null) {
            if (uz5.V(obj)) {
                obj = null;
            }
            if (obj != null) {
                return obj;
            }
        }
        return toAudioLanguageDisplayName(getAudioTrackKey(offlineDownloadMetadata));
    }

    public static final String resolveAudioTrackKey(String str, String str2, String str3) {
        str3.getClass();
        String audioLanguageKey = toAudioLanguageKey(str);
        if (audioLanguageKey != null) {
            return audioLanguageKey;
        }
        String audioLanguageKey2 = toAudioLanguageKey(str2);
        if (audioLanguageKey2 != null) {
            return audioLanguageKey2;
        }
        if (str3.equalsIgnoreCase("dub")) {
            return "en";
        }
        return "ja";
    }

    private static final String toAudioLanguageDisplayName(String str) {
        Locale forLanguageTag = Locale.forLanguageTag(str);
        Locale locale = Locale.ENGLISH;
        String displayName = forLanguageTag.getDisplayName(locale);
        displayName.getClass();
        if (uz5.V(displayName) || displayName.equalsIgnoreCase("und")) {
            displayName = null;
        }
        if (displayName == null) {
            str.getClass();
            String replace = str.replace('-', ' ');
            replace.getClass();
            if (replace.length() > 0) {
                StringBuilder sb = new StringBuilder();
                char charAt = replace.charAt(0);
                locale.getClass();
                String valueOf = String.valueOf(charAt);
                valueOf.getClass();
                String upperCase = valueOf.toUpperCase(locale);
                upperCase.getClass();
                if (upperCase.length() > 1) {
                    if (charAt != 329) {
                        char charAt2 = upperCase.charAt(0);
                        String lowerCase = upperCase.substring(1).toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        upperCase = charAt2 + lowerCase;
                    }
                } else {
                    String valueOf2 = String.valueOf(charAt);
                    valueOf2.getClass();
                    String upperCase2 = valueOf2.toUpperCase(Locale.ROOT);
                    upperCase2.getClass();
                    if (upperCase.equals(upperCase2)) {
                        upperCase = String.valueOf(Character.toTitleCase(charAt));
                    }
                }
                sb.append((Object) upperCase);
                sb.append(replace.substring(1));
                return sb.toString();
            }
            return replace;
        }
        return displayName;
    }

    private static final String toAudioLanguageKey(String str) {
        String obj;
        ni5 osVar;
        Object obj2;
        String language;
        if (str != null && (obj = uz5.w0(str).toString()) != null) {
            if (uz5.V(obj)) {
                obj = null;
            }
            if (obj != null) {
                if (LANGUAGE_TAG_PATTERN.b(obj)) {
                    Locale forLanguageTag = Locale.forLanguageTag(obj);
                    String languageTag = forLanguageTag.toLanguageTag();
                    if (b06.C(languageTag, "und", true)) {
                        languageTag = null;
                    }
                    if (languageTag != null) {
                        String language2 = forLanguageTag.getLanguage();
                        language2.getClass();
                        String isoTwoLetterLanguage = toIsoTwoLetterLanguage(language2);
                        String l0 = uz5.l0('-', languageTag, "");
                        StringBuilder sb = new StringBuilder();
                        sb.append(isoTwoLetterLanguage);
                        if (!uz5.V(l0)) {
                            sb.append("-".concat(l0));
                        }
                        String sb2 = sb.toString();
                        Locale locale = Locale.ROOT;
                        locale.getClass();
                        String lowerCase = sb2.toLowerCase(locale);
                        lowerCase.getClass();
                        return lowerCase;
                    }
                }
                Locale[] availableLocales = Locale.getAvailableLocales();
                availableLocales.getClass();
                if (availableLocales.length == 0) {
                    osVar = st1.a;
                } else {
                    osVar = new os(availableLocales, (byte) 0);
                }
                c32 c32Var = new c32(new d32(osVar, true, new c94((byte) 12)));
                while (true) {
                    if (c32Var.hasNext()) {
                        obj2 = c32Var.next();
                        if (b06.C(((Locale) obj2).getDisplayLanguage(Locale.ENGLISH), obj, true)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                Locale locale2 = (Locale) obj2;
                if (locale2 != null && (language = locale2.getLanguage()) != null) {
                    Locale locale3 = Locale.ROOT;
                    locale3.getClass();
                    String lowerCase2 = language.toLowerCase(locale3);
                    lowerCase2.getClass();
                    return lowerCase2;
                }
                Locale locale4 = Locale.ROOT;
                locale4.getClass();
                String lowerCase3 = obj.toLowerCase(locale4);
                lowerCase3.getClass();
                Pattern compile = Pattern.compile("[^a-z0-9]+");
                compile.getClass();
                String replaceAll = compile.matcher(lowerCase3).replaceAll("-");
                replaceAll.getClass();
                String x0 = uz5.x0(replaceAll, '-');
                if (!uz5.V(x0)) {
                    return x0;
                }
            }
        }
        return null;
    }

    public static final boolean toAudioLanguageKey$lambda$3(Locale locale) {
        locale.getLanguage().getClass();
        return !uz5.V(r0);
    }

    private static final String toIsoTwoLetterLanguage(String str) {
        ni5 osVar;
        Object obj;
        String language;
        Object y45Var;
        if (str.length() != 3) {
            return str;
        }
        Locale[] availableLocales = Locale.getAvailableLocales();
        availableLocales.getClass();
        if (availableLocales.length == 0) {
            osVar = st1.a;
        } else {
            osVar = new os(availableLocales, (byte) 0);
        }
        c32 c32Var = new c32(new d32(osVar, true, new c94((byte) 11)));
        while (true) {
            if (c32Var.hasNext()) {
                obj = c32Var.next();
                try {
                    y45Var = Boolean.valueOf(b06.C(((Locale) obj).getISO3Language(), str, true));
                } catch (Throwable th) {
                    y45Var = new y45(th);
                }
                Object obj2 = Boolean.FALSE;
                if (y45Var instanceof y45) {
                    y45Var = obj2;
                }
                if (((Boolean) y45Var).booleanValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Locale locale = (Locale) obj;
        if (locale != null && (language = locale.getLanguage()) != null) {
            return language;
        }
        return str;
    }

    public static final boolean toIsoTwoLetterLanguage$lambda$0(Locale locale) {
        if (locale.getLanguage().length() == 2) {
            return true;
        }
        return false;
    }
}
