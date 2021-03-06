package pomegranate.core;

import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.IdRes;
import android.support.annotation.StringRes;

import pomegranate.annotations.Visibility;
import pomegranate.pageobject.InstrumentedView;

public interface InstrumentationBuilder {

    <T extends InstrumentedView> T build(Class<T> clazz);

    void appendWithAlphaMatcher(float alpha);

    void appendWithContentDescriptionMatcher(@StringRes int stringResId);

    void appendWithContentDescriptionMatcher(String text);

    void appendWithIdMatcher(@IdRes final int id);

    void appendIsDescendantOfMatcher(@IdRes int id);

    void appendWithTextMatcher(String text);

    void appendWithTextMatcher(@StringRes int stringResId);

    void appendWithHintMatcher(String text);

    void appendWithHintMatcher(@StringRes int stringResId);

    void appendWithTagKeyMatcher(int tagKey);

    void appendIsAssignableFromMatcher(Class clazz);

    void appendWithEffectiveVisibilityMatcher(Visibility visibility);

    void appendWithInputTypeMatcher(int inputTypeFlags);

    void appendWithResourceNameMatcher(String resourceName);

    void appendWithSpinnerTextMatcher(@StringRes int stringResId);

    void appendWithSpinnerTextMatcher(String spinnerText);

    void appendWithSubstringMatcher(String substring);

    void appendWithParentIndexMatcher(int parentIndex);

    void appendIsDisplayedMatcher();

    void appendIsCheckedMatcher();

    void appendIsCompletelyDisplayedMatcher();

    void appendIsClickableMatcher();

    void appendIsDisplayingAtLeastMatcher(int percent);

    void appendIsFocusableMatcher();

    void appendIsRootMatcher();

    void appendIsSelectedMatcher();

    void appendIsNotCheckedMatcher();

    void appendIsJavascriptEnabledMatcher();

    void appendIsEnabledMatcher();

    void appendHasBackgroundMatcher(@DrawableRes int drawableResId);

    void appendHasChildCountMatcher(int childCount);

    void appendHasContentDescriptionMatcher();

    void appendSupportsInputMethodsMatcher();

    void appendHasFocusMatcher();

    void appendHasLinksMatcher();

    void appendHasErrorTextMatcher(@StringRes int stringResId);

    void appendHasErrorTextMatcher(String error);

    void appendHasMinimumChildCountMatcher(int childCount);

    void appendHasTextColorMatcher(@ColorRes int colorResId);

    void appendHasImeActionMatcher(int imeAction);
}
