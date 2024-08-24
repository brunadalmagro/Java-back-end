package br.com.Patterns;

record Customer(String gradeRequest, boolean hasCompanyContract) {

    public String getGradeRequest() {
        return gradeRequest;
    }
}
