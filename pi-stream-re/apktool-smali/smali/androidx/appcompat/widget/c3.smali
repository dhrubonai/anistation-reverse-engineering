.class public final Landroidx/appcompat/widget/c3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/appcompat/widget/c3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/appcompat/widget/c3;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/c3;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/appcompat/widget/c3;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :pswitch_0
    check-cast v1, Lh8/x;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string p1, ""

    .line 27
    .line 28
    :goto_0
    iput-object p1, v1, Lh8/x;->t:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v1}, Lh8/x;->i()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_1
    check-cast v1, Lcom/google/android/material/textfield/TextInputLayout;

    .line 35
    .line 36
    iget-boolean v0, v1, Lcom/google/android/material/textfield/TextInputLayout;->O0:Z

    .line 37
    .line 38
    xor-int/lit8 v0, v0, 0x1

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-virtual {v1, v0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->t(ZZ)V

    .line 42
    .line 43
    .line 44
    iget-boolean v0, v1, Lcom/google/android/material/textfield/TextInputLayout;->B:Z

    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    invoke-virtual {v1, p1}, Lcom/google/android/material/textfield/TextInputLayout;->n(Landroid/text/Editable;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    iget-boolean v0, v1, Lcom/google/android/material/textfield/TextInputLayout;->J:Z

    .line 52
    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    invoke-virtual {v1, p1}, Lcom/google/android/material/textfield/TextInputLayout;->u(Landroid/text/Editable;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    return-void

    .line 59
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 1

    .line 1
    iget p2, p0, Landroidx/appcompat/widget/c3;->a:I

    .line 2
    .line 3
    iget-object p3, p0, Landroidx/appcompat/widget/c3;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    goto :goto_1

    .line 9
    :pswitch_0
    check-cast p3, Lh8/y;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    const-string p1, ""

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :goto_0
    invoke-virtual {p3, p1}, Lh8/y;->a(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :pswitch_1
    return-void

    .line 24
    :pswitch_2
    check-cast p3, Landroidx/appcompat/widget/SearchView;

    .line 25
    .line 26
    iget-object p2, p3, Landroidx/appcompat/widget/SearchView;->G:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 27
    .line 28
    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    iput-object p2, p3, Landroidx/appcompat/widget/SearchView;->p0:Ljava/lang/CharSequence;

    .line 33
    .line 34
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    xor-int/lit8 p2, p2, 0x1

    .line 39
    .line 40
    invoke-virtual {p3, p2}, Landroidx/appcompat/widget/SearchView;->x(Z)V

    .line 41
    .line 42
    .line 43
    xor-int/lit8 p2, p2, 0x1

    .line 44
    .line 45
    iget-boolean p4, p3, Landroidx/appcompat/widget/SearchView;->o0:Z

    .line 46
    .line 47
    const/16 v0, 0x8

    .line 48
    .line 49
    if-eqz p4, :cond_1

    .line 50
    .line 51
    iget-boolean p4, p3, Landroidx/appcompat/widget/SearchView;->h0:Z

    .line 52
    .line 53
    if-nez p4, :cond_1

    .line 54
    .line 55
    if-eqz p2, :cond_1

    .line 56
    .line 57
    iget-object p2, p3, Landroidx/appcompat/widget/SearchView;->L:Landroid/widget/ImageView;

    .line 58
    .line 59
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 60
    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    :cond_1
    iget-object p2, p3, Landroidx/appcompat/widget/SearchView;->N:Landroid/widget/ImageView;

    .line 64
    .line 65
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p3}, Landroidx/appcompat/widget/SearchView;->t()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p3}, Landroidx/appcompat/widget/SearchView;->w()V

    .line 72
    .line 73
    .line 74
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :goto_1
    if-eqz p1, :cond_2

    .line 82
    .line 83
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    const/4 p4, 0x2

    .line 88
    if-lt p2, p4, :cond_2

    .line 89
    .line 90
    check-cast p3, Lz3/e;

    .line 91
    .line 92
    iget-object p2, p3, Lz3/e;->b:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p2, Ln8/a;

    .line 95
    .line 96
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    iget-object p2, p2, Ln8/a;->b:Lmsr/pistream/app/ui/player/PlayerActivity;

    .line 101
    .line 102
    iget-object p2, p2, Lmsr/pistream/app/ui/player/PlayerActivity;->F:Lf8/h;

    .line 103
    .line 104
    invoke-virtual {p2, p1}, Lf8/h;->d(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    :cond_2
    return-void

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
