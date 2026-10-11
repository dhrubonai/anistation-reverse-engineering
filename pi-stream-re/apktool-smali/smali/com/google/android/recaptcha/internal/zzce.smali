.class public abstract Lcom/google/android/recaptcha/internal/zzce;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# instance fields
.field private final zza:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzce;->zza:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "toString"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lr6/h0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    array-length v0, v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string p2, "Proxy@"

    .line 33
    .line 34
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    goto/16 :goto_4

    .line 39
    .line 40
    :cond_0
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "hashCode"

    .line 45
    .line 46
    invoke-static {v0, v1}, Lr6/h0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    array-length v0, v0

    .line 57
    if-nez v0, :cond_1

    .line 58
    .line 59
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    goto/16 :goto_4

    .line 68
    .line 69
    :cond_1
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const-string v1, "equals"

    .line 74
    .line 75
    invoke-static {v0, v1}, Lr6/h0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_6

    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    array-length v0, v0

    .line 86
    if-nez v0, :cond_2

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_2
    const/4 p2, 0x0

    .line 90
    if-eqz p3, :cond_5

    .line 91
    .line 92
    array-length v0, p3

    .line 93
    if-nez v0, :cond_3

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    aget-object p3, p3, p2

    .line 97
    .line 98
    if-eqz p3, :cond_4

    .line 99
    .line 100
    invoke-virtual {p3}, Ljava/lang/Object;->hashCode()I

    .line 101
    .line 102
    .line 103
    move-result p3

    .line 104
    goto :goto_0

    .line 105
    :cond_4
    move p3, p2

    .line 106
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-ne p3, p1, :cond_5

    .line 111
    .line 112
    const/4 p2, 0x1

    .line 113
    :cond_5
    :goto_1
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    goto :goto_4

    .line 118
    :cond_6
    :goto_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/recaptcha/internal/zzce;->zza(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    sget-object p3, Lw6/f;->a:Lw6/f;

    .line 123
    .line 124
    if-nez p1, :cond_7

    .line 125
    .line 126
    move-object p1, p3

    .line 127
    goto :goto_4

    .line 128
    :cond_7
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzce;->zza:Ljava/lang/Object;

    .line 129
    .line 130
    if-nez p1, :cond_8

    .line 131
    .line 132
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 137
    .line 138
    invoke-static {p1, v0}, Lr6/h0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    if-eqz p1, :cond_8

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_8
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzce;->zza:Ljava/lang/Object;

    .line 146
    .line 147
    if-eqz p1, :cond_a

    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzgd;->zza(Ljava/lang/Class;)Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-static {v0}, Lcom/google/android/recaptcha/internal/zzgd;->zza(Ljava/lang/Class;)Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-static {p1, v0}, Lr6/h0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    if-eqz p1, :cond_a

    .line 170
    .line 171
    :goto_3
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzce;->zza:Ljava/lang/Object;

    .line 172
    .line 173
    if-nez p1, :cond_9

    .line 174
    .line 175
    return-object p3

    .line 176
    :cond_9
    :goto_4
    return-object p1

    .line 177
    :cond_a
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzce;->zza:Ljava/lang/Object;

    .line 178
    .line 179
    new-instance p3, Ljava/lang/IllegalArgumentException;

    .line 180
    .line 181
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    new-instance v0, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    const-string p1, " cannot be returned from method with return type "

    .line 194
    .line 195
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw p3
.end method

.method public abstract zza(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Z
.end method
