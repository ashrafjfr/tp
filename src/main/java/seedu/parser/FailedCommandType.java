package seedu.parser;

public enum FailedCommandType {
    GENERAL, INVALID_FLAG, MISSING_ARG, MISSING_ARGS_EDIT, MISSING_ARGS_ADD, MISSING_ARGS_SEARCH,
    MISSING_DETAIL, MISSING_INDEX, INVALID_NUM,
    INVALID_FORMAT, NUM_OUT_OF_BOUND, NUM_OUT_OF_BOUND_EDIT, INVALID_INDEX, MISSING_NAME,
    FORBIDDEN_DETAIL, INVALID_NAME, INVALID_GITHUB_USERNAME,
    INVALID_LINKEDIN, INVALID_TELEGRAM, INVALID_MAIL, INVALID_TWITTER, INVALID_DELETE
}
